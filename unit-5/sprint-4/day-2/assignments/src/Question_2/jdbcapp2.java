package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcapp2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ProductId: ");
		int pid = sc.nextInt();
		
		System.out.println("Enter ProductName: ");
		String pname = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try (Connection conn = DriverManager.getConnection(url,"root","subham@1234")){
			
			PreparedStatement ps = conn.prepareStatement("insert into product (pid,pname) values(?,?)");
			ps.setInt(1, pid);
			ps.setString(2, pname);
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("updated..........");
			}else {
				System.out.println("Not updated..........");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}





