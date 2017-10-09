package com.eteTickets.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eteTickets.entity.City;
import com.eteTickets.entity.Flight;
import com.eteTickets.entity.User;
import com.eteTickets.service.UserService;
import com.eteTickets.dao.CityDao;
import com.eteTickets.dao.FlightDao;
import com.eteTickets.dao.UserDao;

public class Main {

	public static void main(String[] args) {
	
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
//		UserService userService =  (UserService) context.getBean("UserServiceImpl");
//		
//		User user = new User();
//		
//		user.setFirstName("Jaguar");
//		user.setLastName("Paw");
//		user.setEmail("jaguar@");
//		user.setPassword("password");
//		
//		userService.save(user);
//		
//		context.close();
		
	}

}
