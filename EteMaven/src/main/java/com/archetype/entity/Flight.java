package com.archetype.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	

	private int FreeSeats;
	
	private int price;
	
	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	private City cityFrom;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private City cityTo;
	
	private LocalDate departureDate;
	
	private LocalTime departureTime;
	
	private LocalDate arrivalDate;
	
	private LocalTime arrivalTime;
	
	@ManyToMany
	@JoinTable(name = "flight_user", joinColumns = @JoinColumn(name = "id_flight"), 
	inverseJoinColumns = @JoinColumn(name = "id_user"))
	private List<User> users = new ArrayList<User>();
	
	public Flight(){
		
		super();
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFreeSeats() {
		return FreeSeats;
	}

	public void setFreeSeats(int freeSeats) {
		FreeSeats = freeSeats;
	}
	

	public City getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(City cityFrom) {
		this.cityFrom = cityFrom;
	}

	public City getCityTo() {
		return cityTo;
	}

	public void setCityTo(City cityTo) {
		this.cityTo = cityTo;
	}


	



	public LocalDate getDepartureDate() {
		return departureDate;
	}



	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}




	public LocalDate getArrivalDate() {
		return arrivalDate;
	}



	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}



	



	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}



	public LocalTime getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}



	public LocalTime getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	@Override
	public String toString() {
		return "Flight [id=" + id + ", FreeSeats=" + FreeSeats + ", price=" + price + ", cityFrom=" + cityFrom
				+ ", cityTo=" + cityTo + ", departureDate=" + departureDate + ", departureTime=" + departureTime
				+ ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime + "]";
	}




	
	
}
