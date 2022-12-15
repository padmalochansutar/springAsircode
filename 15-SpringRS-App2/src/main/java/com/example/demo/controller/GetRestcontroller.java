package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("res1")
public class GetRestcontroller {
	@GetMapping
	public String getGreetMsg() {
		String msg="Good morning....!!";
		return msg;
	}
	@GetMapping("/wish")
	public String getWishMsg() {
		String msg="All the best....!!";
		return msg;
	}
}
