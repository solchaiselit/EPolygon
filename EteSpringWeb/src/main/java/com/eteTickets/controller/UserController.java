package com.eteTickets.controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eteTickets.entity.User;
import com.eteTickets.service.UserService;

public class UserController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();
		
		user.setFirstName(req.getParameter("firstName"));
		user.setLastName(req.getParameter("lastName"));
		user.setEmail(req.getParameter("email"));
		user.setPassword(req.getParameter("password"));
		
		UserService userService = (UserService) WelcomeController.context.getBean("userServiceImpl");
		
		userService.save(user);
		
		req.getRequestDispatcher("/WEB-INF/views/registration.jsp").forward(req, resp);
		
	}
	
	
	
}
