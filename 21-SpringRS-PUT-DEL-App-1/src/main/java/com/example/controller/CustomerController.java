package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Customer;

@RestController
public class CustomerController {
	@PutMapping(value="/updateData",consumes = {"application/json","application/xml"},produces = {"application/json"})
	public ResponseEntity<String> UpdateCustomer(@RequestBody Customer customer){
		//logic to update customer record
		System.out.println(customer  );
		return new ResponseEntity<String>("UpdateSuccessfully", HttpStatus.OK);
		
	}
	@DeleteMapping(value="/delete/{cId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer cId){
		//logic to delete customer record
		return new ResponseEntity<String>("delete Successfully",HttpStatus.OK);
		
	}

}
