package com.airline.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import service.Time;

@Entity
public class City {

	
	@Id
	private int id;
	
	private String name;
	

	
	
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

	
	
}
