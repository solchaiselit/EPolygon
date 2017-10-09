package com.eteTickets.service;

import java.util.List;

import com.eteTickets.entity.City;
import com.eteTickets.entity.User;

public interface CityService {

	
	void save(City city);
	
	List<City> findAll();
	
	City findOne(int id);
	
	void delete(int id);
	
	void update(City city);
	
}
