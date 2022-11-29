package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;

public class ProvideBonusUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bonus:  ");
		int bonus = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.provideBonusToAll(bonus);
		
		
		
		
	}
}
