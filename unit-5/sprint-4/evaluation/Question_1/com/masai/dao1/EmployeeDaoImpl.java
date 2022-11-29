package com.masai.dao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.model1.Employee;
import com.masai.utility1.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void registerEmployeeWithOutDeptId(Employee emp) {
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into employee "
					+ "(empid,ename,address,email,password,salary) "
					+ "values(?,?,?,?,?,?)");
			
			
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getAddress());
			ps.setString(4, emp.getEmail());
			ps.setString(5, emp.getPassword());
			ps.setInt(6, emp.getSalary());
		
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("Employee Registered Successfully");
			}else {
				System.out.println("Unable to register employee....");
			}
			
			

			
		} catch (SQLException e) {
			
		}
		
	}

	@Override
	public void loginEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateExistingEmpPassword(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
