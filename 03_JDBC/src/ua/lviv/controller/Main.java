package ua.lviv.controller;

import com.mysql.jdbc.Connection;

import java.sql.*;

import ua.lviv.dao.UserDao;
import ua.lviv.entity.User;

public class Main {

	
//	static final String URL = "jdbc:mysql://localhost/jdbc";
//	static final String USER = "root";
//	static final String PASSWORD = "cerveausentiment";
	
	static final String URL = "jdbc:mysql://localhost/jdbc";
	static final String USER = "root";
	static final String PASSWORD = "123456";
	
	static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		connection = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
		
		UserDao userDao = new UserDao(connection);
		
		User user = new User("ira", "princess");
		
		userDao.save(user);
		
		
//		connection = (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
//		PreparedStatement preparedStatement = (PreparedStatement) connection
//				.prepareStatement("create table user(id int primary key " 
//				+ "auto_increment, name varchar(40), password varchar(60))");
//		
//		preparedStatement.execute();
				
	}

}
