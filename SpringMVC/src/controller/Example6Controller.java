package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import repository.FlightRepository;
import entity.Flight;

@Controller
@RequestMapping("/flights/*")
public class Example6Controller {

	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(Flight flight, Map model) {
		flightRepository.newFlight(flight);
		model.put("message", "Record added successfully!");
		return "example6Output";
	}
	
	//similarly we can club together other operations like
	//edit, update, delete, sort, ...
	
	
	/*@RequestMapping("add")
	public ModelAndView add(Flight flight) {
		ModelAndView mav = new ModelAndView("example6Output");
		mav.addObject("message", "Record added successfully!");
		return mav;
	}*/
}
