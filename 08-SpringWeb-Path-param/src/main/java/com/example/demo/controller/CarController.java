package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
	//pathParam
	@GetMapping("/data/{carName}")
	@ResponseBody
	public String getCarData(@PathVariable String carName) {//pathvariable("carName") is optional..@PathVariable is mandatory other wise error..
		String msg="the"+carName+"is   8.9lk";
		return msg;
	}
	@GetMapping("/det/{carLocation}/{carPrice}")
	@ResponseBody
	public String getDetails(@PathVariable String carLocation,@PathVariable Double carPrice) {
		String msg="carlocation is:"+carLocation+"and price is"+carPrice;
		return msg;
		
	}
	

}
