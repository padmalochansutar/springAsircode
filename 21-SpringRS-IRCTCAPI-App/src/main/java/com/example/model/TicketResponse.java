package com.example.model;

import lombok.Data;

@Data
public class TicketResponse {
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String from;
	private String to;
	private String train;
	private String status;
	private Double price;

}
