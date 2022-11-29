package Question_3;

import java.util.ArrayList;
import java.util.List;

public class Library {
	public static void main(String[] args) {
		
	}
	
	List<Book> bookList = new ArrayList<Book>();
	
	public void addBook(Book book)throws BookException{
		
		
		bookList.add(new Book(2, "java", "Subham"));
		
		
	}
	
	public List viewAllBooks()throws BookException{
		return bookList;
		
	}
	
	public List viewBooksByAuthor(String author)throws BookException{
		
		return bookList;
	}
	
	public  Book getBookByISBN(int isbn)throws BookException{
		
		return bookList.get(isbn);
	}
}
