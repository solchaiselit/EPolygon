package com.planetickets.service;

import java.util.List;

import com.planetickets.entity.FreeSeat;

public interface FreeSeatService {

	void save(FreeSeat freeSeat);
	List<FreeSeat> findAll(int flightId);
	FreeSeat findOne(int id);
	void delete(int id); 
	void update(FreeSeat freeSeat);
	
}
