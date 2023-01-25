package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.PassengerRequest;
import com.example.response.TicketResponse;
import com.example.service.TicketService;

@RestController
public class TicketBookingRestController {
	@Autowired
	private TicketService ticketService;
	@PostMapping(value="/book" ,consumes = {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public TicketResponse bookTicket(@RequestBody PassengerRequest requestData) {
		System.out.println(requestData);
		return ticketService.initiateTicketBookProcess(requestData);
	} 

}
