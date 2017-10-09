package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.entity.Flight;
import com.service.FlightService;



@Service
public class FlightServiceImpl extends CrudServiceImpl<Flight, Integer> implements FlightService {

	@Autowired
	public FlightServiceImpl(JpaRepository<Flight, Integer> repository) {
		super(repository);
	
	}
	
	
	
	
}
