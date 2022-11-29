package Eval_question;

import java.util.*;

public class List {
	
	static ArrayList<Book> bookList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search book by author");
		System.out.println("4.Search book by isbn");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		if(sc.nextInt()==1) {
			System.out.println("Enter the isbn no:");
			int isbn = sc.nextInt();
			System.out.println("Enter the book name");
			String bookName = sc.next();
			System.out.println("Enter the author name");
			String author = sc.next();
			try {
				addBook(new Book(isbn, bookName, author));
				System.out.println("Book added successfully");
				System.out.println(bookList);
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search book by author");
		System.out.println("4.Search book by isbn");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		
		if(sc.nextInt()==1) {
			System.out.println("Enter the isbn no:");
			int isbn = sc.nextInt();
			System.out.println("Enter the book name");
			String bookName = sc.next();
			System.out.println("Enter the author name");
			String author = sc.next();
			try {
				addBook(new Book(isbn, bookName, author));
				System.out.println("Book added successfully");
				System.out.println(bookList);
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search book by author");
		System.out.println("4.Search book by isbn");
		System.out.println("5.Exit");
		System.out.println("Enter your choice:");
		
		if(sc.nextInt()==3) {
			System.out.println("Enter the author name");
			
			try {
				viewBooksByAuthor(sc.next());
			} catch (BookException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	

	static void addBook(Book book) throws BookException {
		
		if(bookList.size()==0) {
			bookList.add(book);
		}else {
			
			for (int i = 0; i < bookList.size(); i++) {
				if (bookList.get(i).equals(book)) {
					throw new BookException("Book already exists");
				} else {
					bookList.add(book);
				}
			}
		}
	}

	static ArrayList<Book> viewAllBooks() throws BookException {
		if (bookList.size() == 0) {
			throw new BookException("Currently There is no Book in the Library");
		} else {
//			Collections.sort();
			return bookList;
		}

	}

	static ArrayList<Book> viewBooksByAuthor(String author) throws BookException {
		boolean r = false;
		ArrayList<Book> SearchList = new ArrayList<>();

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getAuthor() == author) {
				r = true;
				SearchList.add(bookList.get(i));
			}
		}
		if (r) {
			return SearchList;
		} else {
			throw new BookException("There is not any book of this author");
		}

	}

	static ArrayList<Book> getBookByISBN(int isbn) throws BookException {
		boolean r = false;
		ArrayList<Book> SearchList = new ArrayList<>();
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getIsbn() == isbn) {
				r = true;
				SearchList.add(bookList.get(i));
			}
		}
		if (r) {
			return SearchList;
		} else {
			throw new BookException("There is not any book of this isbn");
		}

	}
}
