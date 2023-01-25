package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InsurancePlan;
import com.example.demo.repository.InsurancePlanRepository;

import net.bytebuddy.asm.Advice.This;

@Service
public class InsuranceService {
	@Autowired
	private InsurancePlanRepository insurancePlanRepository;

	public void savePlan()  {
		String dateString="2022-03-12";
		
		try {
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(dateString));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InsurancePlan plan = new InsurancePlan();
		// Optional<InsurancePlan> findById = insurancePlanRepository.findById(2);
		// InsurancePlan data=findById.get();
		// update data here...
		plan.setPlanStatus("emo");
		plan.setPlanName("DemoLoan");
		plan.setPlanStatus("tiot");
       
			plan.setDate(new Date());
		
		InsurancePlan save = insurancePlanRepository.save(plan);
	}

}
