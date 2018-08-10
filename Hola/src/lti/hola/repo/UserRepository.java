package lti.hola.repo;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.ProfileBean;
import lti.hola.bean.RegisterBean;

/**
 * Repository interface for variety of databases
 * @author Krishna, Nilesh
 *
 */

public interface UserRepository {
	RegisterBean authenticate(LoginBean login);

	boolean validate(ForgotBean forgot);

	boolean changePassword(LoginBean login);

	boolean persist(RegisterBean register);

	boolean displayProfile(ProfileBean profile);
	
	

}
