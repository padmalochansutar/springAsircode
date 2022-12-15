package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//query parameter
@Controller
public class BookController {
	@GetMapping("/data")
	@ResponseBody
	public String getbookDetails(@RequestParam(name = "isbn" ,required = false,defaultValue = "Isbn90012") String str) {//if query-param key and method parameter name both same then @requestparam is optional..otherweise it is mandatory....
		String msg="The book of"+str+"of=450.00";//if i dont want to give any queryparam and want to diplay default value (@RequestParam(name = "isbn" ,required = false,defaultValue = "Isbn90012") 
		return msg;
		
	}

}
