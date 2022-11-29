package com.masai.usecase1;

import java.util.Scanner;

import com.masai.dao1.EmployeeDao;
import com.masai.dao1.EmployeeDaoImpl;
import com.masai.model1.Employee;

public class RegisterEmployeeUseCase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Enter empid: ");
		int empid = sc.nextInt();
		System.out.println("Enter ename: ");
		String ename = sc.next();
		System.out.println("Enter address: ");
		String address = sc.next();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter password: ");
		String password = sc.next();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		
		Employee emp = new Employee(empid, ename, address, email, password, salary, 0);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		dao.registerEmployeeWithOutDeptId(emp);
		
				
		
	}

}
