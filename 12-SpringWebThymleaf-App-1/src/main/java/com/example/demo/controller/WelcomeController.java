package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
     @GetMapping("/welcome")
	public String sendData(Model model) {
		model.addAttribute("msg", "Hello thymleaf");
		return "index";
		
	}
}
