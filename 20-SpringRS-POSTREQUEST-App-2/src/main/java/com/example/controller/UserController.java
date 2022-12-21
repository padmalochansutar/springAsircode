package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {
	@PostMapping(value="/save",consumes = {"application/json","application/xml"}
	,produces = {"application/json","application/xml"})//only for msg we use "text/plain" inside produces.
	public User addUser(@RequestBody User user) {
		System.out.println(user);
		String msg="user add successfully";
		return user;
		
	}

}
