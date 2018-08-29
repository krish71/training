package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import repository.FlightRepository;

@Controller
public class Example10Controller {

	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping("/example10")
	public String execute(Map model) {
		model.put("flights", flightRepository.getAvailableFlights());
		return "example11Output";
	}
	
}
