package Question_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcapp1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(i<4) {
			i++;
		
		System.out.println("Enter Product ID: ");
		int pid = sc.nextInt();
		
		System.out.println("Enter Product Nmae: ");
		String pname = sc.next();
		
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter Price: ");
		int price = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/web20sb101db";
		
		try (Connection conn = DriverManager.getConnection(url,"root","subham@1234")){
			
			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?)");
			
			ps.setInt(1, pid);
			ps.setString(2, pname);
			ps.setInt(3, quantity);
			ps.setInt(4, price);
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Updated Successfully.....");
			}else {
				System.out.println("Not updated.....");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}










