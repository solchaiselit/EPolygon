package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	
	
}
