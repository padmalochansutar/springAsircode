package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cd")//class level url pattern
public class MyController {

	@GetMapping("/welcome")//method level url pattern
	public ModelAndView displayWelcomemsg() {
		ModelAndView maView=new ModelAndView();
		maView.addObject("msg", "hello spring web mvc");
		maView.setViewName("index");
		return maView;
	}
	//@GetMapping("/greet")//both GetMapping and @RequestMapping are same but in spring 2.4.1 onwards we have used GetMapping 2.4.1 before we are using requestmapping..
	@RequestMapping(value = "/greet" ,method=RequestMethod.GET)
	public ModelAndView displaygreetMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","good morning.!!");
		mav.setViewName("index");
		return mav;
	}
}
