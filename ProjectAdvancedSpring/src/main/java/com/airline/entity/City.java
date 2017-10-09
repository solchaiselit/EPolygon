package com.airline.entity;

import service.Time;

public class City {

	private int id;
	
	private String name;
	
	private Time flightDuration;

	
	
	public City() {
		super();
	}



	public City(String name) {
		super();
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Time getTimeToHub() {
		return flightDuration;
	}



	public void setTimeToHub(Time timeToHub) {
		this.flightDuration = timeToHub;
	}



	@Override
	public String toString() {
		return "City [name=" + name + ", timeToHub=" + flightDuration + "]";
	}
	
	
	
	
}
