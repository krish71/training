package repo;

import bean.ForgetBean;
import bean.LoginBean;
import entity.Customer;

public interface UserRepo {

	Customer authenticate(LoginBean login);
	
	boolean validate(ForgetBean forget);
	
	boolean changePassword(LoginBean change);
	
	boolean persist(Customer customer);
}
