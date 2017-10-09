package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import entity.User;

public class UserDao {
	
	private final Connection connection;

	public UserDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	public void save(User user) throws SQLException {
		
		PreparedStatement ps = (PreparedStatement) connection.prepareStatement("INSERT INTO user"
				+ " (first_name, last_name) "
				+ "values (?,?)");
		
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		
		ps.executeUpdate();
		
		ps.close();
		
	}
	
	public void deleteUserByName(String firstName, String lastName) throws SQLException{
		
		PreparedStatement ps = (PreparedStatement) connection.prepareStatement
				("delete from user where first_name = ? and last_name = ?");
		
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		
		ps.executeUpdate();
		
		ps.close();
				
	}
	
	public List<User> findAll() throws SQLException{
		
		PreparedStatement ps = (PreparedStatement) connection.prepareStatement("select * from user");
		
		
		ps.executeQuery();
		
		ResultSet rs = ps.getResultSet();
		
		
		List<User> list = new ArrayList<>();
		
		while(rs.next()){
			
			User user = new User();
			
			user.setFirstName(rs.getString(2));
			user.setLastName(rs.getString("last_name"));
			
			list.add(user);
			
		}
		
		for(User user: list){
			
			System.out.println("First name: " +user.getFirstName() + 
					"; Last name: " + user.getLastName());			
			
		}
		
		ps.close();
		
		return list;
	}
	

}
