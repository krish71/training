package pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "User")
public class User {
	@Id
	@Column(name = "user_Id", length = 50)

	private String userId;

	@Column(name = "password", length = 100)
	@NotNull
	private String password;

	@Column(name = "email_id", length = 100)
	@NotNull
	private String email;
	@OneToMany(mappedBy="User",cascade= {CascadeType.ALL},fetch=FetchType.EAGER)
	@OnDelete(action=OnDeleteAction.CASCADE)
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
