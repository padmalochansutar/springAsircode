package com.example.demo.controller;


import java.time.LocalDate;
//import java.util.Date;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DateController {
	@GetMapping("")
	public ModelAndView getTodaysDate() {
		ModelAndView modelAndView=new ModelAndView();
		//java.util.Date class will give both date and time together
		//Date date=new Date();
		//to avoid date and time together java 8 feature given localdate
		LocalDate lcDate=LocalDate.now();//locaLdate represent date only and also localtime represent time only..
		 DateTimeFormatter format =
			      DateTimeFormatter.ofPattern("dd-MM-yyyy "); 
			   
			    String formatedDateTime = lcDate.format(format); 
			    
			    System.out.println("in formatted manner "+
			                        formatedDateTime);
		//modelAndView.addObject("msg", "Todays date::"+date);
		modelAndView.addObject("msg", "Todays date::"+formatedDateTime);
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
