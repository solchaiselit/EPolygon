package com.archetypes.dao;

import java.util.List;

import com.archetype.entity.City;
import com.archetype.entity.Flight;

public interface CityDao {
	
	
	void save(City city);
	
	City findOne(String name);
	
	List<City> findAll();
	
	void delete (String name);
	
	void update (String name);
	
	void addFlightToCity(Flight flight, City city);
	
	void addFlightFromCity(Flight flight, City city);
	
	
	

}
