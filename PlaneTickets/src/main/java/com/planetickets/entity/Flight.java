package com.planetickets.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TreeMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class Flight {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	
	@OneToMany(mappedBy="flight")
	private List<Ticket> tickets;
	
	@ManyToOne
    private City city;
	
	@ManyToMany
	@JoinTable(name="flight_seat",
	joinColumns=@JoinColumn(name="flight_id"),
	inverseJoinColumns=@JoinColumn(name="seat_id"))
	private List<FreeSeat> freeSeats;
	
	

	public Flight() {
		super();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDateTime getDepartureTime() {
		return departureTime;
	}



	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}



	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}



	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}



	public List<Ticket> getTickets() {
		return tickets;
	}



	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}



	public City getCity() {
		return city;
	}



	public void setCity(City city) {
		this.city = city;
	}



	public List<FreeSeat> getFreeSeats() {
		return freeSeats;
	}



	public void setFreeSeats(List<FreeSeat> freeSeats) {
		this.freeSeats = freeSeats;
	}

	

	
	
	
	
	
}
