package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.response.QuoteResponseApi;
import com.example.service.QuoteClient;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteClient quoteClient;
	@GetMapping("/quote")
	public String returndata() {
		//String invokeRandomQuoteApi = quoteClient.invokeRandomQuoteApi();
		String invokeQuoteApi = quoteClient.invokeQuoteApi();
		return invokeQuoteApi;
	}

}
