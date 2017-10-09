package com.eteTickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteTickets.dao.FlightDao;
import com.eteTickets.entity.Flight;
import com.eteTickets.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightDao flightDao;

	@Override
	public void save(Flight flight) {
		
		flightDao.save(flight);		
	}

	@Override
	public List<Flight> findAll() {
		
		return flightDao.findAll();
	}

	@Override
	public Flight findOne(int id) {
		
		return flightDao.findOne(id);
	}

	@Override
	public void delete(int id) {
	
		flightDao.delete(id);
	}

	@Override
	public void update(Flight flight) {
		
		flightDao.save(flight);
	}
	
	

}
