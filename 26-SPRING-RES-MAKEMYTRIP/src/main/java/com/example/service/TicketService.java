package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.request.PassengerRequest;
import com.example.response.TicketResponse;

@Service
public class TicketService {
	
	public TicketResponse initiateTicketBookProcess(PassengerRequest request) {
		String endpointUrl="http://localhost:8080/bookticket";
		RestTemplate rt=new RestTemplate();//rest template is a rest client
		ResponseEntity<TicketResponse> postForEntity = rt.postForEntity(endpointUrl, request, TicketResponse.class);
		TicketResponse body = postForEntity.getBody();
		return body;
	}

}
