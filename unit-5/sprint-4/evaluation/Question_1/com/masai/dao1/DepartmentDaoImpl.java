package com.masai.dao1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception1.DepartmentException;
import com.masai.model1.Department;
import com.masai.utility1.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public void addDepartment(Department department) throws DepartmentException {
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");
			
			ps.setInt(1, department.getDid());
			ps.setString(2, department.getDname());
			ps.setString(3, department.getLocation());
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("Department added Successfully........");
			}
			else {
				System.out.println("Can not add......");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException("Action can not be performed");
			
		}
		
	}

	@Override
	public void assignRegisteredEmployeeToExistingDept() {
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update employee set deptid=1 where name='subham'");
			
			int x = ps.executeUpdate();
			if(x==0) {
				System.out.println("Task completed.....");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Department> getAllDeptDetails() throws DepartmentException {
		List<Department> list = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("select * from department");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int did = rs.getInt("did");
				String dname = rs.getString("dname");
				String location = rs.getString("location");
				
				Department dept = new Department(did, dname, location);
				list.add(dept);
				
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException();
		}
		
		return list;
		
		
	}

	@Override
	public void updateDeptLocation() throws DepartmentException {
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update department set location=? where did=1");
			ps.setString(1, "chennai");
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException();
		}
		
	}


	@Override
	public void deleteDeptByDid() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
