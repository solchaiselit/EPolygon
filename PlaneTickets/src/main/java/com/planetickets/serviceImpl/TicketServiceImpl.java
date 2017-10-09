package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.TicketDao;
import com.planetickets.entity.Ticket;
import com.planetickets.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	
	@Autowired
	private TicketDao ticketDao;
	
	public void save(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Ticket findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Ticket ticket) {
		// TODO Auto-generated method stub
		
	}

	
	
}
