package com.airline.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.*;

@Entity

public class AirlineCompany {

	@Id
	
	private int id;
	private String name;
	
	@ManyToMany
	@JoinTable(name = "airline_user",
	joinColumns = 
	@JoinColumn(name = "id_airline"),
	inverseJoinColumns = 
	@JoinColumn(name = "id_user"))
	
	private List<User> users;
	
	
	public AirlineCompany() {
		super();
	}

	
	
	public AirlineCompany(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}
