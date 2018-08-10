package lti.hola.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.ProfileBean;
import lti.hola.bean.RegisterBean;

/**
 * Repository interface for variety of databases
 * @author Krishna, Nilesh
 *
 */

public class UserRepositoryImpl implements UserRepository {
	private Connection getConnection() throws SQLException {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			Connection conn = ds.getConnection();
			return conn;
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean displayProfile(ProfileBean profile) {
		String sql = "select name, email,age, gender, city, profilePhoto from users where email=? and password=?";
		Connection conn = null;
		
		

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, profile.getEmail());
			stmt.setString(2, profile.getPassword());
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
			//stmt.setString(2, profile.getEmail());
			//stmt.setString(1, profile.getPassword());
			stmt.executeUpdate();
			stmt.setString(1, profile.getName());
			stmt.setString(2,profile.getEmail());
			//stmt.setString(3, register.getPassword());
			stmt.setInt(4, profile.getAge());
			stmt.setString(5, profile.getGender());
			stmt.setString(6, profile.getCity());
			//stmt.setString(7, register.getMovie());
			stmt.setString(8, profile.getProfilePhoto());
			
			stmt.executeQuery();
			return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return false;


	}

	@Override
	public boolean validate(ForgotBean forgot) {
		String sql = "select * from users where email=? and movie=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, forgot.getEmail());
			stmt.setString(2, forgot.getMovie());
			ResultSet rs = stmt.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
				try {if (conn != null)
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	@Override
	public boolean changePassword(LoginBean login) {
		String sql = "update users set password=? where email=?";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login.getPassword());
			stmt.setString(2, login.getEmail());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			
				try {
					if (conn != null)
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	@Override
	public boolean persist(RegisterBean register) {
		String sql = "insert into users values(?,?,?,?,?,?,?,?)";
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, register.getName());
			stmt.setString(2, register.getEmail());
			stmt.setString(3, register.getPassword());
			stmt.setInt(4, register.getAge());
			stmt.setString(5, register.getGender());
			stmt.setString(6, register.getCity());
			stmt.setString(7, register.getMovie());
			stmt.setString(8, register.getProfilePhoto());
			
			stmt.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}


	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		String sql = "select * from users where email=? and password=?";
		RegisterBean user = null;
		Connection conn = null;

		try {
			conn = getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, login.getEmail());
			stmt.setString(2, login.getPassword());
			
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				user = new RegisterBean();
				user.setName(rs.getString(1));
				user.setEmail(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setGender(rs.getString(5));
				user.setCity(rs.getString(6));
				user.setMovie(rs.getString(7));
				user.setProfilePhoto(rs.getString(8));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

		return null;

	}
}
