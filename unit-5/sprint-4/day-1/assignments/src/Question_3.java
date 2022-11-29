import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Q2/- What is JDBC, Write a note on JDBC driver software
 * 
 * Answer:- 
 * 
 */
public class Question_3 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Loading.........");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not load the driver main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try {
			Connection conn = DriverManager.getConnection(url,"root","subham@1234");
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
