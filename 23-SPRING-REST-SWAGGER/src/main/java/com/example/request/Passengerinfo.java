package com.example.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Passengerinfo {
	
	private String fname;
	
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;

}
