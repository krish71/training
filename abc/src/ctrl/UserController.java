package ctrl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import bean.ForgetBean;
import bean.LoginBean;
import entity.Customer;
import service.UserService;

@Controller//annotation for controller
public class UserController{
	@Autowired
	private UserService service;
	
	@RequestMapping("login.do")// used to map web requests onto specific handler classes and/or handler methods. 
	public String checkLogin(LoginBean login,Map model,HttpSession session)
	{
		Customer customer=service.authenticate(login);
		if(customer!=null)
			{
			session.setAttribute("Customer", customer);
			return "dashboard";
			}
		else
			{
			model.put("Prompt", "User id password incorrect");
			return "home";
			}
	}
	@RequestMapping("forget.do")
	public String forgetPass(ForgetBean forget,Map model, HttpSession session)
	{
		if(service.validate(forget)) {
			session.setAttribute("Id", forget.getUserId());
			return "change";
		}
		else
		{
			model.put("Invalid", "User id and email incorrect");
			return "forget";
		}
		
	}
	
	@RequestMapping("change.do")
	public String changePass(LoginBean change,Map model, HttpSession session)
	{
		change.setEmail((String)session.getAttribute("Id"));
		if(service.changePassword(change)) {
			model.put("Prompt", "Password changed succesfully");
			return "home";
		}
		else
		{
			model.put("Invalid", "Password does not match");
			return "change";
		}
	
	}
	@RequestMapping("register.do")
	public String persist(Customer customer,Map model) {
		if(service.persist(customer)) {
			model.put("Prompt", "Thanku for registration");
			return "home";
			
		}else
		{
			model.put("Invalid", "user id already exist");
			return "register";
		}
	}
	
	@RequestMapping("logout.do")
	public String logout(Map model,HttpSession session) {
		session.invalidate();
		model.put("Invalid", "Logout Successfully");
		return "home";
	}
	
	
}

