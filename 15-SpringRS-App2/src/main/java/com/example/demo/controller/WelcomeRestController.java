package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/res2")
public class WelcomeRestController {
//	@GetMapping
//	public String getGreetMsg() {
//		String msg="Good morning....!!";
//		return msg;//SERVER DECICDE STATUS CODE
//	}
	@GetMapping
   public ResponseEntity<String> getMsg(){
	   String msg="welcome....!!";
			   return new ResponseEntity<String>(msg,HttpStatus.OK);//PROGRAMEER DECIDE STATUS CODE
   }
}
