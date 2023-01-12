package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping(value="/getdata/{userId}")
	public String getidData(@PathVariable Integer userId) {
		if(userId==100) {
			return "raju";
		}
		else if(userId==50) {
			return "jagan";
		}
       return "user not added";			
	}

}
