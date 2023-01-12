package com.example.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reponse.Ticketinfo;
import com.example.request.Passengerinfo;

@RestController
public class AirIndiaRestController {
	@PostMapping( value="/bookFlightTicket",consumes = {"application/json","application/xml"},
			produces = {"application/xml","application/json"})
	public ResponseEntity<Ticketinfo> bookTicket(@RequestBody Passengerinfo pinfo){
		//logic to book ticket
		//send ticket info
	     Ticketinfo ticket=new Ticketinfo();
	     ticket.setName(pinfo.getFname()+" "+pinfo.getLname());
//	     ticket.setFrom(pinfo.getFrom());
//	     ticket.setTo(pinfo.getTo());
	     ticket.setTicketStatus("confirmed");
	     ticket.setTicketPrice("4500.00 INR");
	     ticket.setJourneyDate(pinfo.getJourneyDate());
	     BeanUtils.copyProperties(pinfo,ticket);
	     return new ResponseEntity<Ticketinfo>(ticket,HttpStatus.CREATED);
	}

}
