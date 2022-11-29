package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.model.Employee;

public class InsertEmployeeUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter empid: ");
		int empid = sc.nextInt();
		
		System.out.println("Enter ename: ");
		String ename = sc.next();
		
		System.out.println("Enter address: ");
		String address = sc.next();
		
		System.out.println("Enter mobile: ");
		String mobile = sc.next();
		
		System.out.println("Enter did: ");
		int did = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee emp = new Employee(empid, ename, address, mobile, did);
		
		dao.insertDetailsOfEmployee(emp);
	}
}






