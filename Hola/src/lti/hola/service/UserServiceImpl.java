package lti.hola.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.ProfileBean;
import lti.hola.bean.RegisterBean;
import lti.hola.repo.UserRepository;
import lti.hola.repo.UserRepositoryImpl;

/**
 * Repository interface for variety of databases
 * @author Krishna, Nilesh
 *
 */

public class UserServiceImpl implements UserService {
	private UserRepository repo;

	public UserServiceImpl() {
		repo = new UserRepositoryImpl();
	}

	@Override
	public RegisterBean authenticate(LoginBean login) {
		// Password encoding
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(login.getPassword().getBytes());
		login.setPassword(encoded);
		return repo.authenticate(login);
	}

	@Override
	public boolean validate(ForgotBean forgot) {
		Encoder encoder = Base64.getEncoder();
		forgot.setMovie(encoder.encodeToString(forgot.getMovie().getBytes()));
		return repo.validate(forgot);
	}

	@Override
	public boolean changePassword(LoginBean login) {
		Encoder encoder = Base64.getEncoder();
		login.setPassword(encoder.encodeToString(login.getPassword().getBytes()));
		return repo.changePassword(login);
	}

	@Override
	public boolean persist(RegisterBean register) {
		Encoder encoder = Base64.getEncoder();
		register.setPassword(encoder.encodeToString(register.getPassword().getBytes()));
		register.setMovie(encoder.encodeToString(register.getMovie().getBytes()));
		return repo.persist(register);
	}
	
public boolean displayProfile(ProfileBean profile) {	
	return repo.displayProfile(profile);
	}


}
