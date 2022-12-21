package com.example.irctccontroller;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PassengerRequest;
import com.example.model.TicketResponse;

@RestController
public class IrctcController {
	@PostMapping(value="/bookticket",consumes= {"application/json","application/xml"},
			produces= {"application/json","application/xml"})
	public  TicketResponse bookTicket(@RequestBody PassengerRequest request) {
		
		TicketResponse response=new TicketResponse();
		response.setStatus("confirmed");
		response.setPrice(1500.00);
		BeanUtils.copyProperties(request, response);
		return response;
		
	}

}
