package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.FreeSeatDao;
import com.planetickets.entity.FreeSeat;
import com.planetickets.service.FreeSeatService;


@Service
public class FreeSeatServiceImpl implements FreeSeatService {

	@Autowired
	private FreeSeatDao freeSeatDao;
	
	public void save(FreeSeat freeSeat) {
		// TODO Auto-generated method stub
		
	}

	public List<FreeSeat> findAll(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	public FreeSeat findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(FreeSeat freeSeat) {
		// TODO Auto-generated method stub
		
	}

	
	
}
