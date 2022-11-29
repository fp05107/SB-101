package com.masai.usecase2;

import java.util.Scanner;

import com.masai.dao2.ProductDao;
import com.masai.dao2.ProductDaoImpl;
import com.masai.exception2.ProductException;

public class GetAllProductQuantityLessThanUseCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity = sc.nextInt();
		
		
		ProductDao dao = new ProductDaoImpl();
		try {
			dao.getAllProductQuantityLessThan(quantity);
		} catch (ProductException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
