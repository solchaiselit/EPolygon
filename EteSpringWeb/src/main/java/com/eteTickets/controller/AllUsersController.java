package com.eteTickets.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eteTickets.entity.User;
import com.eteTickets.service.UserService;

public class AllUsersController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserService userService = (UserService) WelcomeController.context.getBean("userServiceImpl");
		
		List<User> users = userService.findAll();
		
		for(User u: users){
		
			req.setAttribute("showUsers", u.toString() + " <br> ");
			
		}
		
		
		
		req.getRequestDispatcher("WEB-INF/views/allUsers.jsp").forward(req, resp);
		
	}

	
	
}
