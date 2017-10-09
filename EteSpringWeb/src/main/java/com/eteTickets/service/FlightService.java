package com.eteTickets.service;

import java.util.List;

import com.eteTickets.entity.Flight;
import com.eteTickets.entity.User;

public interface FlightService {
	
	void save(Flight flight);
	
	List<Flight> findAll();
	
	Flight findOne(int id);
	
	void delete(int id);
	
	void update(Flight flight);

}
