package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.Plan;

@Controller
public class PlanController {
	@GetMapping("/planData")
	@ResponseBody//response body is used for show plan objectbdata from webServer .....if you return plan object to web server it will give Exception...and also response body is converted from object to jsonObject
	public Plan getdata() {
	     Plan plan=new Plan();
	     plan.setPlanId(102);
	     plan.setName("Airtel");
	     plan.setStatus("Approved");
	     return plan;
	}
	

}
