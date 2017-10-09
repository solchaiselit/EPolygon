package com.airline.entity;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ticket {

	
	private int id;
	
	private User user;
	
	private int price;
	
	private Map<Flight, Seat> tripMap; 
	
	private Set<Entry<Flight, Seat>> entrySet = tripMap.entrySet();

	
	public Ticket() {
		super();
	}


	public Ticket(User user) {
		super();
		this.user = user;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Map<Flight, Seat> getTripMap() {
		return tripMap;
	}


	public void setTripMap(Map<Flight, Seat> tripMap) {
		this.tripMap = tripMap;
	}


	public Set<Entry<Flight, Seat>> getEntrySet() {
		return entrySet;
	}


	public void setEntrySet(Set<Entry<Flight, Seat>> entrySet) {
		this.entrySet = entrySet;
	}
	
	
	
	
}
