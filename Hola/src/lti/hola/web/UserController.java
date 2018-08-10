package lti.hola.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	public void init() throws ServletException {
		service = new UserServiceImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String referer = request.getHeader("referer");
		//Getting session from request-If session id exist in request header
		//old session object returned otherwise fresh session created 
		HttpSession session = request.getSession();

		if (referer.contains("Home.jsp")) 
		{
			// request coming from home for login authentication
			RegisterBean user = LoginController.authenticate(request);
			if (user != null) 
			{
				// Login successful-keeping logged in user's details ion session
				session.setAttribute("User", user);
				
				response.sendRedirect("Profile.jsp");
			} else {
				// Login failed
				response.sendRedirect("Home.jsp?invalid=yes");
			}
		} 
		else if (referer.contains("Register.jsp")) 
		{
			// Request coming for validating user for password change
			if (RegisterController.registration(request))
				response.sendRedirect("Home.jsp");
			else
				response.sendRedirect("Register.jsp");
		} 
		else if (referer.contains("Forgot.jsp")) 
		{
			// Request coming for validating user for password change
			if (LoginController.forgotPassword(request))
				response.sendRedirect("Change.jsp");
			else {
				response.sendRedirect("Forgot.jsp");
			}
		} 
		else if (referer.contains("Change.jsp")) {
			// Request coming for updating password
			if (LoginController.changePassword(request))
				response.sendRedirect("Home.jsp");
			else
				response.sendRedirect("Change.jsp");
		}
	else { 
		//Requesting coming for logout-destroying session
		session.invalidate();
	response.sendRedirect("Home.jsp");
		
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
