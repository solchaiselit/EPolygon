package jdbcByHeart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import dao.UserDao;
import entity.User;

public class Main {

	
	static final String URL = "jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false"; 
	static final String USERNAME = "root";
	static final String PASSWORD = "cerveausentiment";

	static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
	
		User user = new User();
		
//		user.setFirstName("mushka");
//		user.setLastName("porosychyk");
		
		
		UserDao userDao = new UserDao(connection);
		
//		userDao.save(user);
		
		
//		User user1 = new User("Leonardo", "Di Caprio");
		
		userDao.deleteUserByName("mushka", "porosychyk");
		
//		userDao.save(user1);
		
		userDao.findAll();
				
	    connection.close();
		
			
		}
		
		
		
		
		
	

}
