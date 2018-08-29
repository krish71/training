package lti.ctrl;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lti.bean.LoginBean;

@Controller
public class LoginController {
	
	@RequestMapping("/login.go")
	public String checkLogin(LoginBean login, Map map) {
		if((login.getEmail().equals("duke@java.com")) && (login.getPassword().equals("java"))){
			map.put("Greeting", "Welcome " + login.getEmail());
			return "welcome";
		}
		else {
			map.put("Invalid", "Email /Password does not match");
			return "home";
		}
	}
	
}

	
//	public ModelAndView checkLogin(LoginBean login) {
//		ModelAndView mav = new ModelAndView();
//		if (login.getEmail().equals("duke@java.com") && login.getPassword().equals("java")) {
//			// Login Successful
//			mav.addObject("Greeting","Welcome "+ login.getEmail());
//			mav.setViewName("welcome");
//		} else {
//			// Login failed
//			mav.addObject("Invalid", "Email /Password does not match");
//			mav.setViewName("home");
//		}
//		return mav;
//	}