package com.eteTickets.service;

import java.util.List;

import com.eteTickets.entity.Ticket;
import com.eteTickets.entity.User;

public interface TicketService {

	void save(Ticket ticket);
	
	List<Ticket> findAll();
	
	Ticket findOne(int id);
	
	void delete(int id);
	
	void update(Ticket ticket);
	
}
