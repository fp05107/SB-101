package com.masai.dao1;

import java.util.List;

import com.masai.exception1.DepartmentException;
import com.masai.model1.Department;

public interface DepartmentDao {
	
	public void addDepartment(Department department)throws DepartmentException;
	
	public void assignRegisteredEmployeeToExistingDept() throws DepartmentException;
	
	public List<Department> getAllDeptDetails()throws DepartmentException;
	
	public void updateDeptLocation() throws DepartmentException;
	
	public void deleteDeptByDid() throws DepartmentException;
	
	
	
}
