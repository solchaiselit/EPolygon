package com.eteTickets.controller;

import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eteTickets.entity.User;
import com.eteTickets.service.CityService;
import com.eteTickets.service.UserService;

public class WelcomeController extends HttpServlet {
	
	static ConfigurableApplicationContext context = null;
	
	static{
		
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	}

	static{
		
		System.out.println("yo ?");
		
		User user = new User();
	
	
//	CityService cityService = (CityService) context.getBean("CityServiceImpl");
	
//	UserService userService = (UserService) context.getBean("userServiceImpl");
//	
//	user.setFirstName("Jaguar");
//	user.setLastName("Paw");
//	user.setEmail("jaguar@");
//	user.setPassword("password");
//	
//	userService.save(user);
//	
//	System.out.println("yo yo");
	
	}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.setAttribute("key", "value");
		
		req.getRequestDispatcher("Welcome.jsp").forward(req, resp);

	}


	
	
	


}
