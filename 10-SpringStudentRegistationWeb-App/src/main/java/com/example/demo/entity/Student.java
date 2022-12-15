package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String email;
	
	private Long phoneNo;
	
	private String gender;
	
	private String course;
	
	private String timings;

}
