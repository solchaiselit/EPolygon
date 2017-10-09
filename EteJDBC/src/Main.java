import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;



public class Main {

	static final String URL = "jdbc:mysql://localhost:3306/i_database";
	static final String USER = "root";
	static final String PASSWORD = "cerveausentiment";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		try(Connection conn = DriverManager.getConnection(URL, 
				USER, PASSWORD)){
			
//			Statement st = (Statement) conn.createStatement();
			
			
//			st.execute("CREATE TABLE Employee(id INT PRIMARY KEY AUTO_INCREMENT, name varchar(40))");
			
//			st.execute("INSERT INTO Employee e (name n) VALUES ("Ihor");");
			
//			st.close();
			
	PreparedStatement ps = (PreparedStatement) 
			conn.prepareStatement("INSERT INTO Employee (name) VALUES (?), (?)");
	
//			ps.setString(1,"Ira");
//			ps.setString(2, "Olha");
//			
//						
//			ps.executeUpdate();
			
			
			
			String s = "SELECT * FROM Employee";
			
			ResultSet rs = ps.executeQuery(s);
			
			while(rs.next()){
				
				System.out.print(rs.getString(2)+" ");
			}
			
		
			ps.close();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
				
		
	}

}
