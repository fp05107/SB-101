package com.masai.usecase;
import java.util.*;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class InsertEmployeeWithOutAddressUseCase {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter emp id: ");
		int eid = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		dao.insertEmployeeWithOutAddress(eid, name, salary);
		
		
		
		
		
		
	}

}
