package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;


@Data
public class AccountPK implements Serializable {
	
	private Integer accId;
	
	private String accType;
	
	private String accHolderName;
	

}
