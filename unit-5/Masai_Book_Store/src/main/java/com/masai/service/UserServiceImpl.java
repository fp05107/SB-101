package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.Author;
import com.masai.model.Book;
import com.masai.model.Cart;
import com.masai.model.User;
import com.masai.repository.UserDao;
import com.masai.repository.UserSessionDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserSessionDao userSessionDao;

	@Override
	public User registerUser(User user) throws UserException {
		
		User existingUser = userDao.findByMobileNumber(user.getMobileNumber());
		if (existingUser != null)
			throw new UserException("User already registered with this Mobile number!");
		return userDao.save(user);
		
	}

	
	@Override
	public Author registerAuthor(Author author) throws UserException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> purchaseBook(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book addBookToCart(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author mostPopularAuthor(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> refreshCart(Cart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author deleteAuthor(Integer authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> addToCartAuto() {
		// TODO Auto-generated method stub
		return null;
	}

}
