package com.masai.usecase2;

import java.util.Scanner;

import com.masai.dao2.ProductDao;
import com.masai.dao2.ProductDaoImpl;
import com.masai.exception2.ProductException;
import com.masai.model2.Product;

public class AddProductQuantityUsecase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter productid:");
		int productid = sc.nextInt();
		System.out.println("Enter Productname:");
		String prodname = sc.next();
		System.out.println("Enter productPrice:");
		int prodprice = sc.nextInt();
		System.out.println("Enter productQuantity:");
		int prodquantity = sc.nextInt();
		
		Product prod = new Product(productid, prodname, prodprice, prodquantity);
		
		ProductDao dao = new ProductDaoImpl();
		try {
			dao.addProduct(prod);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
