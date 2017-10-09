package com.airline.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Ticket {

	@Id
	private int SeatId;
	
//	private User user;
	
	private int price;
	
//	private Seat seat;
	
	

	
	public Ticket(User user, int price) {
		super();
//		this.user = user;
		this.price = price;

	}




	public Ticket() {
		super();
	}


//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public int getId() {
//		return SeatId;
//	}




	public void setId(int id) {
		this.SeatId = id;
	}








	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getSeatId() {
		return SeatId;
	}




	public void setSeatId(int seatId) {
		SeatId = seatId;
	}



//	@OneToOne(fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	public Seat getSeat() {
//		return seat;
//	}





	
	
	
}
