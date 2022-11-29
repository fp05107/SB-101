package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.DepartmentDao;
import com.masai.dao.DepartmentDaoImpl;
import com.masai.exception.DepartmentExceptions;
import com.masai.model.Department;

public class InsertDepartmentUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter did: ");
		int did = sc.nextInt();
		System.out.println("Enter dname: ");
		String dname = sc.next();
		System.out.println("Enter Location: ");
		String location = sc.next();
		
		DepartmentDao dao = new DepartmentDaoImpl();
		Department dept = new Department(did, dname, location);
		
		try {
			dao.insertDetailsOfDepartment(dept);
		} catch (DepartmentExceptions e) {
			e.printStackTrace();
		}
		
	}
}





