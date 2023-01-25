package com.example.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement
public class PassengerRequest {

	private String dob;
	private String doj;
	private String from;
	private String gender;
	private String name;
	private String to;
	private String train;
}
