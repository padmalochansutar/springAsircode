package com.example.restcontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Flight;
import com.example.entity.Flights;
import com.example.service.FlightService;

@RestController
public class FlightRestController {
	@Autowired
	private FlightService flightService;

	@GetMapping("/flights")
	public String getFlight() {
		String invokeUnitedFlightApi = flightService.invokeUnitedFlightApi();// my api is communicating with another api
																				// using resttemplate
		return invokeUnitedFlightApi;

	}

	@GetMapping("/flight")
	public List<Flight> getFlights() {
		return flightService.invokeFlightApi();
		
	}
}
