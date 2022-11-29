package com.masai.dao;

import java.util.List;

import com.masai.exception.EmployeeExceptions;
import com.masai.model.Employee;

public interface EmployeeDao {
	
	public Employee insertDetailsOfEmployee(Employee employee);
	public List<Employee> getEmployeeDetailsWorksInDevDepartMent()throws EmployeeExceptions;
}
