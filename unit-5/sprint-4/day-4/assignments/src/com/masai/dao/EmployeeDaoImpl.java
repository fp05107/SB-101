package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.EmployeeExceptions;
import com.masai.model.Employee;
import com.masai.utility.DBUtil;
import com.mysql.cj.protocol.Resultset;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee insertDetailsOfEmployee(Employee employee) {
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?) ");
			ps.setInt(1, employee.getEmpid());
			ps.setString(2, employee.getEmpname());
			ps.setString(3, employee.getAddress());
			ps.setString(4, employee.getMobile());
			ps.setInt(5, employee.getDid());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Employee Joined Successfully.........");
			}
			else {
				System.out.println("Employee can not join.........");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeDetailsWorksInDevDepartMent() throws EmployeeExceptions {
		List<Employee> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee where did=10");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				int empid = rs.getInt("empid");
				String ename = rs.getString("empname");
				String address = rs.getString("address");
				String mobile = rs.getString("mobile");
				int did = rs.getInt("did");
				
				Employee emp = new Employee(empid, ename, address, mobile, did);
				list.add(emp);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
		
		
	}
	
	
}
