package com.masai.usecase1;

import java.util.Scanner;

import com.masai.dao1.DepartmentDao;
import com.masai.dao1.DepartmentDaoImpl;
import com.masai.exception1.DepartmentException;
import com.masai.model1.Department;

public class AddDepartmentUsecase {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter did: ");
		int did = sc.nextInt();
		System.out.println("Enter dname: ");
		String dname = sc.next();
		System.out.println("Enter location: ");
		String location = sc.next();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		Department dept = new Department(did, dname, location);
		try {
			dao.addDepartment(dept);
		} catch (DepartmentException e) {
			
			e.printStackTrace();
		}
		
	}
}
