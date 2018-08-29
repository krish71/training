package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import repository.FlightRepository;

@Controller
public class Example7Controller {

	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping("/example7")
	public String list(@RequestParam("view") String viewType, Map model) {
		model.put("flights", flightRepository.getAvailableFlights());
		if(viewType.equals("pdf"))
			return "example7PdfOutput";
		else
			return "example7Output";
	}
}
