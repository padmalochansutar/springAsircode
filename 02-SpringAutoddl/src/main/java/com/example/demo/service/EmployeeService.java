package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
//there are three types of injection 1.setter injection 2.constructor injection 3.field injection
//field injection........
	@Autowired
	private EmployeeRepository employeeRepository;
	
public void saveData() {
		Employee employee=new Employee();
		employee.setEmpId(105);
		employee.setEmpName("eman");
		employee.setAge(17);
		employeeRepository.save(employee);
		
		
	}
}
