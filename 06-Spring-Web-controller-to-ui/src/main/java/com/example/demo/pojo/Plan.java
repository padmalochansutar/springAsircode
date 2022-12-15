package com.example.demo.pojo;

import ch.qos.logback.core.status.Status;
import lombok.Data;

@Data
public class Plan {
	
	private Integer planId;
	
	private String name;
	
	private String status;

}
