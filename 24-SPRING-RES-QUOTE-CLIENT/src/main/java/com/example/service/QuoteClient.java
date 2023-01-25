package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.response.QuoteResponseApi;

@Service
public class QuoteClient {
	
	public String invokeRandomQuoteApi() {
		String apiUrl="http://localhost:9090/book";
		
		RestTemplate rT=new RestTemplate();
		ResponseEntity<String> responseEntity=rT.getForEntity(apiUrl, String.class);
		int statusCode=responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			String body=responseEntity.getBody();
			System.out.println(body);
			return body;
		}
		return null;
	}
	public String invokeQuoteApi() {
		String apiUrl="http://localhost:9090/book";
		
		RestTemplate rT=new RestTemplate();
		ResponseEntity<QuoteResponseApi> responseEntity=rT.getForEntity(apiUrl, QuoteResponseApi.class);
		int statusCode=responseEntity.getStatusCodeValue();
		if(statusCode==200) {
			QuoteResponseApi body=responseEntity.getBody();
			System.out.println(body);
			return body.getBookName().toUpperCase();
		}
		return null;
	}

}
