package com.example.bean;

import lombok.Data;

@Data
public class Customer {
	
	private Integer cuId;
	
	private String cuName;//dont take variable name as cName it will give the result as null ...
	
	private String email;

}
