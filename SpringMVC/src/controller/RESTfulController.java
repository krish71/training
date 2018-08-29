package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import repository.FlightRepository;
import entity.Flight;
import entity.FlightList;

@Controller
@RequestMapping("/rest/*")  
public class RESTfulController {

	@Autowired
	private FlightRepository flightRepository;

	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public @ResponseBody FlightList getFlightsList() {
		FlightList fl = new FlightList();
		fl.setFlights(flightRepository.getAvailableFlights());
		return fl;
	}

	@RequestMapping(value = "/flight/{flightNo}", method = RequestMethod.GET)
	public @ResponseBody Flight getDetailsofFlight(@PathVariable("flightNo") String flightNo) {
		return flightRepository.getFlightInfo(flightNo);
	}


}
