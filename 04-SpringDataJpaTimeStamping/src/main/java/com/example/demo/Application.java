package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.InsurancePlan;
import com.example.demo.service.InsuranceService;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		InsuranceService bean = run.getBean(InsuranceService.class);
		bean.savePlan();
		run.close();
	}

}
