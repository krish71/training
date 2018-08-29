package service;

import java.util.Base64;

import java.util.Base64.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bean.ForgetBean;
import bean.LoginBean;
import entity.Customer;
import repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired // Dependency injection of repo inside service
	private UserRepo repo;

	@Override
	public Customer authenticate(LoginBean login) {
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(login.getPassword().getBytes()); // password encoding
		login.setPassword(encoded); // setting the password
		return repo.authenticate(login);

	}

	@Override
	public boolean validate(ForgetBean forget) {
		return repo.validate(forget);// Validating the user by passing the forget obj

	}

	@Override
	public boolean changePassword(LoginBean change) {
		Encoder encoder = Base64.getEncoder();// Encoding using base64
		change.setPassword(encoder.encodeToString(change.getPassword().getBytes()));// setting the new password
		return repo.changePassword(change);
	}

	@Override
	public boolean persist(Customer customer) {
		Encoder encoder = Base64.getEncoder();
		customer.setPassword(encoder.encodeToString(customer.getPassword().getBytes()));
		return repo.persist(customer);

	}

}
