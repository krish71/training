package lti.hola.service;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.ProfileBean;
import lti.hola.bean.RegisterBean;

/**
 * Repository interface for variety of databases
 * @author Krishna, Nilesh
 *
 */

public interface UserService {
	RegisterBean authenticate(LoginBean login);
	
	boolean validate(ForgotBean forgot);
	
	boolean changePassword(LoginBean login);
	
	boolean persist(RegisterBean register);

//	boolean displayprofile(ProfileBean profile);

	boolean displayProfile(ProfileBean profile);
	

}
