package com.archetypes.dao;

import java.util.List;

import com.archetype.entity.City;
import com.archetype.entity.Flight;
import com.archetype.entity.User;

public interface UserDao {
	
	
	 void save(User user);
	
	 User findOne(String firstName, String lastName);
	
	 List<User> findAll();
	 
	 void delete(String lastName, String email);
	 
	 void update(User user);
	 
	 
	

}
