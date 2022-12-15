package com.example.demo.entity;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class User {
	@NotEmpty(message = "please enter user name")
	private String uName;
	@NotEmpty(message = "please enter password")
	private String pwd;
	@NotEmpty(message = "please enter EmailId")
	@Email(message = "please enter valid email")
	private String email;
	
	@NotNull(message = "please enter phonenumber")
//	@Digits( fraction = 2, integer = 4)
	//@Max(value)
	 @Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
	private Long phno;

}
