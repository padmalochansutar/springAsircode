package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="BANK_ACC")
@IdClass(AccountPK.class)
public class Account {
	
	private String branchName;
    private Double minBal;
    
    //private AccountPK accountPK;
   @Id  
   private Integer accId;
   @Id 
   private String accType;
   @Id 
   private String accHolderName;
}
