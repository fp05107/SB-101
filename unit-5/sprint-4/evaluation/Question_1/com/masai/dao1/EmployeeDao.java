package com.masai.dao1;

import com.masai.model1.Employee;

public interface EmployeeDao {
	
	public void registerEmployeeWithOutDeptId(Employee emp);
	
	public void loginEmployee(Employee emp);
	
	public void updateExistingEmpPassword(Employee emp);
	
}
