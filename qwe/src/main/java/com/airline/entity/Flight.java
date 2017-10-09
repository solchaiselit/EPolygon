package com.airline.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	private int id;
	private String departure;
	private String destination;
	private LocalDateTime dateTime;
	private int flightDuration;
	
	@OneToMany(mappedBy="flight")
	
	private List<User> users;
	
	public Flight() {
		super();
	}

	public Flight(String departure, String destination, LocalDateTime dateTime,
			int flightDuration) {
		super();
		this.departure = departure;
		this.destination = destination;
		this.dateTime = dateTime;
		this.flightDuration = flightDuration;
	}
	
	
	
	
}
