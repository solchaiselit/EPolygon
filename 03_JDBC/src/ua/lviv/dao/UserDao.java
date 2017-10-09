package ua.lviv.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ua.lviv.entity.User;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UserDao {

	private final Connection connection;

	public UserDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	
	public void save(User user) throws SQLException{
		
		PreparedStatement preparedStatement = (PreparedStatement) connection
				.prepareStatement("insert into user (name, password )"
						+ "values (?,?)");
		
		preparedStatement.setString(1, user.getName());
		preparedStatement.setString(2, user.getPassword());
		
		preparedStatement.execute();
		
	}
	
	public List<User> findAll() throws SQLException{
		
		ResultSet resultSet = connection 
				.prepareStatement("select id,name,password from user")
				.executeQuery();
		
		List<User> users = new ArrayList<>();
		
		while(resultSet.next()){
			
			User user = new User();
			
			user.setId(resultSet.getInt(1));
			user.setName(resultSet.getString("name"));
			user.setPassword(resultSet.getString("password"));
			
		}
		
		return users;
	}
	
}
