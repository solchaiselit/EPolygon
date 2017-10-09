package com.eteTickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eteTickets.entity.City;
import com.eteTickets.entity.Flight;
import com.eteTickets.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	
	 
	 

}
