package lti.hola.web;

import javax.servlet.http.HttpServletRequest;

import lti.hola.bean.ForgotBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.ProfileBean;
import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class LoginController {

	public static RegisterBean authenticate(HttpServletRequest request) {
		UserService service = new UserServiceImpl();

		// Instantiating login bean to hold login credentials
		LoginBean login = new LoginBean();
		// Reading request parameters and storing in login bean object
		login.setEmail(request.getParameter("email"));
		login.setPassword(request.getParameter("password"));
		// Passing login bean object to service method
		RegisterBean user = service.authenticate(login);
		return user;
	}

	public static boolean forgotPassword(HttpServletRequest request) {
		UserService service = new UserServiceImpl();

		ForgotBean forgot = new ForgotBean();
		forgot.setEmail(request.getParameter("email"));
		forgot.setMovie(request.getParameter("movie"));
		return service.validate(forgot);

	}

	public static boolean changePassword(HttpServletRequest request) {
		UserService service = new UserServiceImpl();

		LoginBean change = new LoginBean();
		change.setEmail(request.getParameter("email"));
		change.setPassword(request.getParameter("password"));
		return service.changePassword(change);

	}
	

//	public static boolean displayProfile(HttpServletRequest request) {
//		UserService service = new UserServiceImpl();
//
//		ProfileBean profile = new ProfileBean();
//		profile.setEmail(request.getParameter("email"));
//		profile.setPassword(request.getParameter("password"));
//		return service.displayProfile(profile);
//
//	}

}
