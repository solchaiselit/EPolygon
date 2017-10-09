package com.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "cityTo")
	private List<Flight> flightsTo;
	
	@OneToMany(mappedBy = "cityFrom")
	private List<Flight> flightsFrom;
	

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

	public List<Flight> getFlightsTo() {
		return flightsTo;
	}

	public void setFlightsTo(List<Flight> flightsTo) {
		this.flightsTo = flightsTo;
	}

	public List<Flight> getFlightsFrom() {
		return flightsFrom;
	}

	public void setFlightsFrom(List<Flight> flightsFrom) {
		this.flightsFrom = flightsFrom;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}

