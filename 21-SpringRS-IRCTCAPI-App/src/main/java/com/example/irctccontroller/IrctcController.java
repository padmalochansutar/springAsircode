package com.example.irctccontroller;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PassengerRequest;
import com.example.model.TicketResponse;

@RestController
public class IrctcController {
//	@PostMapping(value="/bookticket",consumes= {"application/json","application/xml"},
//			produces= {"application/json","application/xml"})
//	public  TicketResponse bookTicket(@RequestBody PassengerRequest request) {
//		System.out.println(request);
//		TicketResponse response=new TicketResponse();
//		response.setStatus("confirmed");
//		response.setPrice(1500.00);
//		BeanUtils.copyProperties(request, response);
//		return response;
//		
//	}
	@PostMapping(value="/bookticket",consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public  ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request) {
		System.out.println(request);
		TicketResponse response=new TicketResponse();
		response.setStatus("confirmed");
		response.setPrice(1500.00);
		BeanUtils.copyProperties(request, response);
		return new ResponseEntity(response, HttpStatus.CREATED);
	}

}
