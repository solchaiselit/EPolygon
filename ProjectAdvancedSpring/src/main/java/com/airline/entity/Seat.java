package com.airline.entity;

public class Seat {
	
	
	private int id;
	
	private int seatNumber;
	
	private boolean available;

	public Seat(int seatNumber) {
		super();
		this.seatNumber = seatNumber;
	}

	public Seat() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	

}
