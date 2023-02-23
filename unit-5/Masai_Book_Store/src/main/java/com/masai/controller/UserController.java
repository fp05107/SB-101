package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.model.Author;
import com.masai.model.User;
import com.masai.service.UserService;



@RestController
@RequestMapping("/masaibook")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) throws UserException{
		User u = userService.registerUser(user);
		return new ResponseEntity<User>(u,HttpStatus.ACCEPTED);
	}

	
	public ResponseEntity<Author> registerAuthor(@RequestBody Author author) throws UserException{
		Author a = userService.registerAuthor(author);
		return new ResponseEntity<Author>(a,HttpStatus.ACCEPTED);
	}
//	public List<Book> purchaseBook(Cart cart);
//	
//	public Book addBookToCart(Book book);
//	
//	public Author mostPopularAuthor(Cart cart);
//	
//	public List<Book> refreshCart(Cart cart);
//	
//	public Author deleteAuthor(Integer authorId);
//	
//	public List<Book> addToCartAuto();
	
	
	
	
}













