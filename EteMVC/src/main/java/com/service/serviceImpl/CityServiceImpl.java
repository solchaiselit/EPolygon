package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.entity.City;
import com.repository.CityRepository;
import com.service.CityService;



@Service
public class CityServiceImpl extends CrudServiceImpl<City, Integer> implements CityService {

	@Autowired
	public CityServiceImpl(CityRepository repository) {
		
		super(repository);
		
	}

	
	
	
	
}
