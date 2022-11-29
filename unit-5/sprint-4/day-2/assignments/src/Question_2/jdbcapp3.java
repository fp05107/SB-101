package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcapp3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter price: ");
		int price = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try (Connection conn = DriverManager.getConnection(url,"root","subham@1234")){
			PreparedStatement ps = conn.prepareStatement("update product set quantity=?, price=? where quantity=10 and price=1000");
//			PreparedStatement ps2 = conn.prepareStatement("update product set price=? where  price=null");
			ps.setInt(1, quantity);
			ps.setInt(2, price);
			int x = ps.executeUpdate();
			
			
			if(x>0) {
				System.out.println("Updated Successfully.....");
				
			}else {
				System.out.println("Not updated...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}










