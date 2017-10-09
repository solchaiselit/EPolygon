package com.eteTickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eteTickets.entity.City;
import com.eteTickets.entity.Flight;



public interface CityDao extends JpaRepository<City, Integer>{
	
		
//	@Query("insert into City cityTo (flightTo f) values (f.id=:id1)")
//	void addFlightToCity(@Param("id1") int flightId,@Param("cityTo") City cityTo);
	
//	void addFlightFromCity(Flight flight, City city);
	
	
	

}
