package com.masai.usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class GetAllEmployeeUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getAll();
		
		list.forEach(e-> System.out.println(e));
		
		
		
	}
}
