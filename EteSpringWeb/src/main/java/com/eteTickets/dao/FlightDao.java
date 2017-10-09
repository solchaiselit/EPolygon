package com.eteTickets.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eteTickets.entity.City;
import com.eteTickets.entity.Flight;
import com.eteTickets.entity.User;

public interface FlightDao extends JpaRepository<Flight, Integer>{


	
//	void addUserToFlight(User user, Flight flight);

	@Query("select f from Flight f where f.cityFrom =:cityFrom "
			+ " and f.cityTo =:cityTo and f.departureDate =:departureDate")
	List<Flight> findFlightsByCitiesAndDate
	(@Param("cityFrom")City cityFrom, @Param("cityTo")City cityTo,
			@Param("departureDate") LocalDate departureDate);
	
}
