package com.eteTickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteTickets.dao.TicketDao;
import com.eteTickets.entity.Ticket;
import com.eteTickets.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;
	
	
	@Override
	public void save(Ticket ticket) {
		
		ticketDao.save(ticket);
		
	}

	@Override
	public List<Ticket> findAll() {
	
		return ticketDao.findAll();
	}

	@Override
	public Ticket findOne(int id) {
		
		return ticketDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		
		ticketDao.delete(id);
	}

	@Override
	public void update(Ticket ticket) {
	
		ticketDao.save(ticket);
		
	}

	
	
}
