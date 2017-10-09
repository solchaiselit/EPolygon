package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.entity.Ticket;
import com.service.TicketService;



@Service
public class TicketServiceImpl extends CrudServiceImpl<Ticket, Integer> implements TicketService {

	@Autowired
	public TicketServiceImpl(JpaRepository<Ticket, Integer> repository) {
		
		super(repository);
		
	}

	
	
	
}
