package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;


@Data
@Embeddable
public class AccountPK implements Serializable {
	
	private Integer accId;
	
	private String accType;
	
	private String accHolderName;
	

}
