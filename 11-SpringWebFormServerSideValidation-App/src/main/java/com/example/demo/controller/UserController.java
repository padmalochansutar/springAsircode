package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;

@Controller
public class UserController {
	@GetMapping("/loadForm")
	public String loadUserForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "index";
		
	}
	@PostMapping("/saveUSer")
	public String saveUser(@Valid User user,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "user save sucessfully");
		return "dashboard";
		
	}

}
