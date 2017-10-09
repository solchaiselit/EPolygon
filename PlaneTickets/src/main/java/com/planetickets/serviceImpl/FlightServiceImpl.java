package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.FlightDao;
import com.planetickets.entity.Flight;
import com.planetickets.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightDao flightDao;

	public void save(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	public List<Flight> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Flight findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	
	
}
