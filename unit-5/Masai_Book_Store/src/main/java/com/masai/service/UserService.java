package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.Author;
import com.masai.model.Book;
import com.masai.model.Cart;
import com.masai.model.User;

public interface UserService {
	
	public User registerUser(User user) throws UserException;
	
	public Author registerAuthor(Author author) throws UserException;
	
	public List<Book> purchaseBook(Cart cart);
	
	public Book addBookToCart(Book book);
	
	public Author mostPopularAuthor(Cart cart);
	
	public List<Book> refreshCart(Cart cart);
	
	public Author deleteAuthor(Integer authorId);
	
	public List<Book> addToCartAuto();
	
}
