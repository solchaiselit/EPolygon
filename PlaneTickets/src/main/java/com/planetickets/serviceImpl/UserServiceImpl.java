package com.planetickets.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetickets.dao.UserDao;
import com.planetickets.entity.User;
import com.planetickets.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public void save(User user) {
		// validation
		// crypt
		// other logic

		if (user.getEmail().contains("@")) {
			userDao.save(user);

		} else {
			System.out.println("wrong email");
		}
	}
	

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findOne(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
}
