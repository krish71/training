package repo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bean.ForgetBean;
import bean.LoginBean;
import entity.Customer;
@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired //Dependency injection of session factory
	private SessionFactory factory;
	@Override
	public Customer authenticate(LoginBean login) {
		Session session = factory.openSession(); //new session for authentication
		Customer customer=(Customer)session.get(Customer.class, login.getEmail()); //casting session object into User with userId field 
		if(customer!=null&&customer.getPassword().equals(login.getPassword())) //checking if user object is not null and then validating the password
			return customer;
		
		else
			return null;
		
	}

	@Override
	public boolean validate(ForgetBean forget) {
		Session session = factory.openSession();
		Customer customer=(Customer)session.get(Customer.class, forget.getUserId()); //casting session object into User with UserId field 
		if(customer!=null&&customer.getEmail().equals(forget.getEmail())) //validating entered email
			return true;
		
		else
			return false;
		
	}

	@Override
	public boolean changePassword(LoginBean change) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction(); 
		try {
			Customer customer=(Customer)session.get(Customer.class, change.getEmail()); // getting userId field to change password
			customer.setPassword(change.getPassword()); //setting new password
			txn.commit();  // committing the changes made to table
			return true;
		} catch (Exception e) {
			txn.rollback();  // userId field if found to be invalid rollback the changes 
			return false;
		}
	}
//setting the encoded password and saving the object 
	@Override
	public boolean persist(Customer customer) {
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		try {
			session.save(customer);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			return false;
		}
				
	}

}
