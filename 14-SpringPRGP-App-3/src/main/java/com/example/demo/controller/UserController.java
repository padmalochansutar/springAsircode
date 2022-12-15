package com.example.demo.controller;



import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.User;

@Controller
public class UserController {
	private static final org.slf4j.Logger log= LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = { "/","/creatUserAcc" },method=RequestMethod.GET)
	public String loadUserForm(Model model) {
		model.addAttribute("userModel",new User());
		return "creatAcc";
	}

	@RequestMapping(value = "/saveData" ,method = RequestMethod.POST)
	public String accessData(@ModelAttribute("userModel") User user,RedirectAttributes attributes,Model model) {
		
		log.info("user data is:"+user);
		//model.addAttribute("user",new User());
		//model.addAttribute("msg","register successfully");
		attributes.addFlashAttribute("msg","register successfully");
		return "redirect:/data";
		
	}
	@RequestMapping(value = "/data" ,method = RequestMethod.GET)
	public String accessdataDetails(Model model) {
		model.addAttribute("userModel",new User());
		return "creatAcc";
		
	}
}
