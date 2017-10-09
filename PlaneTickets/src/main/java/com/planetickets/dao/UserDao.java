package com.planetickets.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planetickets.entity.User;

public interface UserDao extends JpaRepository <User, Integer> {

 
	
}
