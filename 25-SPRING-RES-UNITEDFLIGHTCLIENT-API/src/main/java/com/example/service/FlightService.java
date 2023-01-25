package com.example.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Flight;
import com.example.entity.Flights;

@Service
public class FlightService {
	
	public String invokeUnitedFlightApi() {
		String endpointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl, String.class);//getforentity take the url
		Integer statusCode = responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			String body = responseEntity.getBody();
			return body;
		}
		return "not add";
	}
	public List<Flight>  invokeFlightApi() {
		String endpointUrl="http://mu.mulesoft-training.com/essentials/united/flights/";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Flights> responseEntity = rt.getForEntity(endpointUrl, Flights.class);
		int statusCodeValue = responseEntity.getStatusCodeValue();
		if(statusCodeValue==200) {
			 Flights body = responseEntity.getBody();
		 System.out.println("the body is..."+body);
			 List<Flight> flights = body.getFlights();
			 flights.forEach(flight->System.out.println(flight.toString()));
			return flights;
		}
		return null;
	}

}
