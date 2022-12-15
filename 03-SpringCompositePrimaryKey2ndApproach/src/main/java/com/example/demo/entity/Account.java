package com.example.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="BANK_ACC")
public class Account {
	
	private String branchName;
    private Double minBal;
    @EmbeddedId
    private AccountPK accountPK;
  
}
