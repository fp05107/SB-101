package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.exception.DepartmentExceptions;
import com.masai.model.Department;
import com.masai.utility.DBUtil;

public class DepartmentDaoImpl implements DepartmentDao{

	@Override
	public Department insertDetailsOfDepartment(Department department) throws DepartmentExceptions  {
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");
			ps.setInt(1, department.getDid());
			ps.setString(2, department.getDname());
			ps.setString(3, department.getLocation());
			
			int x = ps.executeUpdate();
			if(x>0) {
				System.out.println("Department added successfully.....");
				
			}else {
				System.out.println("Not able add this department.......");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentExceptions(e.getMessage());
		}
		
		return department;
	}
	
	

}
