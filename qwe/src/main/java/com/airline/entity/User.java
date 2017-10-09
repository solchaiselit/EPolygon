package com.airline.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.*;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.Entity;

@Entity
/* @Table(name = "customer") */

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	/*@Column(unique = true) */
	private String name;
	private String email;
	private String password;
	
	@ManyToOne
	private Flight flight;
	
	@ManyToMany
	@JoinTable(name = "airline_user",
	joinColumns = 
	@JoinColumn(name = "id_user"),
	inverseJoinColumns = 
	@JoinColumn(name = "id_airline"))
	
	private List<AirlineCompany> airLineCompanies;
	
	public User() {
		super();
	}

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", flight="
				+ flight + "]";
	}
	
	
	
	
 
}
