package com.eteTickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eteTickets.dao.CityDao;
import com.eteTickets.entity.City;
import com.eteTickets.service.CityService;

@Service
public class CityServiceImpl implements CityService{

	@Autowired
	private CityDao cityDao;
	
	@Override
	public void save(City city) {
		
		cityDao.save(city);
	}

	@Override
	public List<City> findAll() {
		
		return cityDao.findAll();
	}

	@Override
	public City findOne(int id) {
	
		return cityDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		
		cityDao.delete(id);
	}

	@Override
	public void update(City city) {
		
		cityDao.save(city);
	}

	
	
}
