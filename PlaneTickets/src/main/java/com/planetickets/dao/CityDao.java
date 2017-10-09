package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.City;



public interface CityDao extends JpaRepository<City, Integer> {

	
	
}
