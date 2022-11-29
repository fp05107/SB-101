package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class GetSalaryUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		int salary = dao.getSalary(id);
		if(salary>0) {
			System.out.println("salary is "+salary);
		}else {
			System.out.println("Employee does not exists");
		}
		
		
	}
}
