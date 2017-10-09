package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.CityDao;
import com.planetickets.entity.City;
import com.planetickets.service.CityService;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDao cityDao;
	
	public void save(City city) {
		// TODO Auto-generated method stub
		
	}

	public List<City> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public City findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(City city) {
		// TODO Auto-generated method stub
		
	}

	
	
}
