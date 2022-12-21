package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class CourseController {
	@GetMapping(value = "/course", produces = {"text/plain","application/json"})
	public String getCourseName(@RequestParam(value = "name",defaultValue = "sbms")String name) {
		String msg=null;
		if("sbms".equals(name)) {
			msg="new batch 8.30";
			
		}else if ("aws".equals(name)) {
			msg="new batch 9.30";
		}else if ("jrtp".equals(name)) {
			msg="new batch 10.30";
		}
		else if("sbms".equals(name) && "jrtp".equals(name)) {
			msg="new batch start from 11.30";
		}
		else {
			msg="please visit our site";
		}
		return msg;
	}
      @GetMapping("/fee")	
      public String  getCourseFee(@RequestParam("cname")String cname, @RequestParam("fee")String fee) {
    	  String msg="the course data is:"+cname+"fees is:"+fee;
    	  return msg;
		
	}
}
