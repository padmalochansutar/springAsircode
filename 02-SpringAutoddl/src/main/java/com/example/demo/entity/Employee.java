package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "Emp_auto_tbl")
public class Employee {

	@Id
	private Integer empId;
	
	private String empName;
	
	private Integer age;

//	public Integer getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(Integer empId) {
//		this.empId = empId;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public Integer getAge() {
//		return age;
//	}
//
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
//	}
//	
//	
//	
}
