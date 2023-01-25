package com.example.demo.entity;


//import java.sql.Date;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name= "INSURANCE_PLANS")
public class InsurancePlan {
	@Id
	@GeneratedValue
	private Integer planId;
	
	private String planName;
	
	private String planStatus;	
//	@CreationTimestamp
//	//@Temporal(TemporalType.DATE)//whenever we are using java.util.date then ok if you want to convert only date and only time  then we can use temporal because convert to date&time to only date  otherwise we cannot use in localDate .
//	@Column(updatable = false)
//	private Date createdDate;
//	@UpdateTimestamp
//	//@Temporal(TemporalType.DATE)
//	@Column(insertable = false)
//	private Date updatedDate;
	
//	@CreationTimestamp
//	@Column(updatable = false)
//	private LocalDate createdDate;
//	
//	@UpdateTimestamp
//	@Column(insertable = false)
//	private LocalDate updatedDate;
	@Temporal(TemporalType.DATE)
	private Date date;
}
