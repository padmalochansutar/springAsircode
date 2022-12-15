package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InsurancePlan;
import com.example.demo.repository.InsurancePlanRepository;

@Service
public class InsuranceService {
	@Autowired
	private InsurancePlanRepository insurancePlanRepository;
	
	public void savePlan() {
		InsurancePlan plan=new InsurancePlan();
		Optional<InsurancePlan> findById = insurancePlanRepository.findById(2);
		InsurancePlan data=findById.get();
		//update data here...
		data.setPlanStatus("hemo");
//		plan.setPlanName("homeLoan");
//		plan.setPlanStatus("tio");
		
		InsurancePlan save = insurancePlanRepository.save(data);
	}

}
