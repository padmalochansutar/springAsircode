package com.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "add")//postman xml data
//<add>
//<userId>102</userId>
//<fname>jagan</fname>
//<lname>sutar</lname>
//<email>j@gmail.com</email>
//</add>
public class User {
	
	private Integer userId;
	
	private String fname;
	private String lname;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("user is created");
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", email=" + email + "]";
	}
	

}
