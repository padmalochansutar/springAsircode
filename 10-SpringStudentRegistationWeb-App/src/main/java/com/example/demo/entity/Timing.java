package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="TIMING")
public class Timing {
	@Id
	@GeneratedValue
	@Column(name="TIMING_ID")
	private Integer timingId;
	@Column(name="TIMING_NAME")
	private String timingName;

}
