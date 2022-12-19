package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
@RestController
public class CustomerRestController {
	@GetMapping(value = "/cus",produces = {"application/json","application/xml"})
	public Customer getCustomerData() {
		Customer customer=new Customer();
		customer.setCustomerId(101);
		customer.setCustomerName("pl");
		customer.setCustomerNo("9876554444");
		return customer;
		
		
	}

}
