package com.planetickets.service;

import java.util.List;

import com.planetickets.entity.User;

public interface UserService {

	void save(User user);
	List<User> findAll();
	User findOne(String lastName);
	void delete(int id);
	void update(int id);
	
}
