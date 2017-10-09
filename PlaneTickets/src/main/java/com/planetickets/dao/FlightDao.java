package com.planetickets.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Integer> {

	
	
}
