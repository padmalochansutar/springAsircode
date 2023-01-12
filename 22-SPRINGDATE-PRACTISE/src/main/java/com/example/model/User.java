package com.example.model;


import java.util.Date;

//import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class User {
	@Id
	
	private Integer userId;
	
	private  String userName;
	 
	//private Date date;//it will take date from postman or ui "yyyy-mm-dd" datatype:-(date) inside database
	private Date date;//datatype inside database (datetime)

}
