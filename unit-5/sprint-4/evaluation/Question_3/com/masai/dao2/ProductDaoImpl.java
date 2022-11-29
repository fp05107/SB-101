package com.masai.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception2.ProductException;
import com.masai.model2.Product;
import com.masai.utility1.DBUtil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public String addProduct(Product product) throws ProductException {
		String message = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into product values(?,?,?,?)");

			ps.setInt(1, product.getProductid());
			ps.setString(2, product.getProductname());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());

			int x = ps.executeUpdate();

			if (x > 0) {
				message = "product added successfully";
			} else {
				message = "can not add product";
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ProductException();
		}

		return message;

	}

	@Override
	public List<Product> getAllProducts() throws ProductException {

		List<Product> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from product");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int productid = rs.getInt("productid");
				String productname = rs.getString("productname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				Product prod = new Product(productid, productname, price, quantity);

				list.add(prod);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ProductException();
		}

		return list;

	}

	@Override
	public List<Product> getAllProductQuantityLessThan(int quantity) throws ProductException {

		List<Product> list = new ArrayList<>();
		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from product where quantity < quantity");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int productid = rs.getInt("productid");
				String productname = rs.getString("productname");
				int price = rs.getInt("price");
				int quantity2 = rs.getInt("quantity");
				Product prod = new Product(productid, productname, price, quantity2);

				list.add(prod);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ProductException();
		}

		return list;

	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {
		String message = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("update product set quantity=? where productid=?");

			ps.setInt(1, Quantity);
			ps.setInt(2, productId);
			int x = ps.executeUpdate();
			if (x > 0) {
				message = "updated successfully";
			} else {
				message = "unable to update";
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ProductException();
		}

		return message;

	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {

		String message = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("delete * from product where productname=pname");
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new ProductException();
		}

		return message;

	}

	@Override
	public Product getProductByProductName(String pname) throws ProductException {
		Product prod = new Product();
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("select * from product where productname=pname");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				
				int productid = rs.getInt("productid");
				String productname = rs.getString("productname");
				int price = rs.getInt("price");
				int quantity = rs.getInt("quantity");
				
				prod.setPrice(price);
				prod.setProductid(productid);
				prod.setQuantity(quantity);
				prod.setProductname(productname);
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ProductException();
			
		}
		
		return prod;
		
		
	}

}
