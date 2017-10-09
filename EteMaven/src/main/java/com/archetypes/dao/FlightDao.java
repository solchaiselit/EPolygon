package com.archetypes.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.archetype.entity.City;
import com.archetype.entity.Flight;
import com.archetype.entity.User;

public interface FlightDao {

	void save(Flight flight);
	
	Flight findOne(City cityFrom, LocalDate departureDate, LocalTime departureTime);
	
	List<Flight> findAll();
	
	void delete(City cityFrom, LocalDate departureDate, LocalTime departureTime);
	
	void update(Flight flight);
	
	void addUserToFlight(User user, Flight flight);
	
	List<Flight> findFlightsByCitiesAndDate(City cityFrom, City cityTo, LocalDate departureDate);
	
}
