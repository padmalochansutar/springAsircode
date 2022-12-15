package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourseDetails(String courseName,String name) {
		
		if(courseName.equals("Spring")) {
			String message=courseName+"by"+name+"time 6:30Am IST";
			return message;
		}
		else if(courseName.equals("java")) {
			String message=courseName+"by"+name+"time 6:30Am IST";
			return message;
		}
		return "contact to Admin-console +91-7864564738";
		
	}
}
