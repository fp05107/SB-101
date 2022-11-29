package com.masai.dao;

import com.masai.exception.DepartmentExceptions;
import com.masai.model.Department;
import com.masai.model.Employee;

public interface DepartmentDao {
	
	public Department insertDetailsOfDepartment(Department department) throws DepartmentExceptions;
	
	
}

