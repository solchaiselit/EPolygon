package com.eteTickets.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteTickets.entity.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Integer> {

	
	
}
