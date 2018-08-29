package controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Example3Controller {

	@RequestMapping("/example3.do")
	public String doSomething(Map model) {
		model.put("message", "Welcome to Spring MVC");
		return "example1";
	}
}
