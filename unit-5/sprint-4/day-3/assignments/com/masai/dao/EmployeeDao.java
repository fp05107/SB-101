package com.masai.dao;

import java.util.List;

import com.masai.model.Employee;

public interface EmployeeDao {
	
	public int getSalary(int id);
	public List<Employee> getAll();
	public void provideBonusToAll(int bonus);
	public void insertEmployeeWithOutAddress(int eid,String name,int salary);
	public Employee searchEmployee(int id);
	public List<Employee> getEmployeeAccordingToSalary(int salary);
	
	

}
