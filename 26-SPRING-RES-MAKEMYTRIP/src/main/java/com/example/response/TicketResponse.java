package com.example.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
@Data
@XmlRootElement
public class TicketResponse {
	private String dob;
	private String doj;
	private String from;
	private String gender;
	private String name;
	private Double price;
	private String status;
	private String to;
	private String train;

}
