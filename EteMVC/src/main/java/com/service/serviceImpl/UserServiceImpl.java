package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.service.UserService;



@Service
public class UserServiceImpl extends CrudServiceImpl<User, Integer> implements UserService {

	@Autowired
	public UserServiceImpl(JpaRepository<User, Integer> repository) {
		super(repository);
		
	}

	
	
}
