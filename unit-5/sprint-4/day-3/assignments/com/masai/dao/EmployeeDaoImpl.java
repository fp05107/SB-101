package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.model.Employee;
import com.masai.utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public int getSalary(int id) {
		int salary = 0;
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("select salary from employee3 where eid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				salary = rs.getInt("salary");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return salary;
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> list = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from employee3");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				Employee employee = new Employee(eid, name, address, salary);
				list.add(employee);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return list;
	}

	@Override
	public void provideBonusToAll(int bonus) {
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update employee3 set salary = salary+?");
			ps.setInt(1, bonus);
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("Updated Successfully......");
			}else {
				System.out.println("error occurs....");
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void insertEmployeeWithOutAddress(int eid,String name,int salary) {
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps =  conn.prepareStatement("insert into employee3 (eid,name,salary) values(?,?,?)");
			ps.setInt(1, eid);
			ps.setString(2, name);
			ps.setInt(3, salary);
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("Updated successfully.......");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Employee searchEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeAccordingToSalary(int salary) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
