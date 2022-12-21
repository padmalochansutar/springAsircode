package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class CourseController {
	
      @GetMapping("/course/{a}/trainer/{b}")	
      public String  getCourseFee(@PathVariable("a") String cname,@PathVariable("b") String fee) {
    	  System.out.println(cname+"--------"+fee);
    	  String msg="the course data is:"+cname+"fees is:"+fee;
    	  return msg;
		
	}
}
