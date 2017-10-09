package com.airline.entity;

import java.time.LocalDateTime;
import java.util.List;

import service.Time;

public class Flight {

	private int id;
	
	private Time flightDuration;
	
	private LocalDateTime departureTime;
	
	private LocalDateTime arrivalTime;
	
//	private List<Seat> seatConfiguration;
	
	private int numberAvailableSeats;
	
//	private City destinationCity;
	
}
