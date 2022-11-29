package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeExceptions;
import com.masai.model.Employee;

public class GetEmployeeAccordingToDept {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> list = dao.getEmployeeDetailsWorksInDevDepartMent();
			
			list.forEach(e-> System.out.println(e));
		} catch (EmployeeExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
