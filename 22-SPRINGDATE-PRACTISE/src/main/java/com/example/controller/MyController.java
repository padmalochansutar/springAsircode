package com.example.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDao;
import com.example.model.User;

@RestController
public class MyController {
	@Autowired
	private UserDao userDao;
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody User user) throws ParseException{
		System.out.println(user);
		
		 
		  String format = new SimpleDateFormat("dd/MM/yyyy").format(user.getDate());
		  System.out.println(format);
		  String substring = format.substring(0,10);
		  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(substring);  
		  //String format = formatter.(user.getDate());
		  System.out.println(date1);
		  
		  user.setDate(date1);
		  //user.setDate(format);
		User save = userDao.save(user);
		return new ResponseEntity("suceessfully saved", HttpStatus.OK);
	}
	
	

}
