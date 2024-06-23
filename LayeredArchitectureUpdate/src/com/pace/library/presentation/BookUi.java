package com.pace.library.presentation;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.pace.library.entity.Book;
import com.pace.library.service.BookServiceProvider;

public class BookUi {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Book book=new Book();
		ArrayList<Book> bookList=new ArrayList<Book>();
		
		BookServiceProvider bookServiceProvider=new BookServiceProvider();
		Scanner scnr=new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("1.Add Book Details 2.Show Book Details 3.Delete Book Details 4.Update Book Details 5.To slash 'Alchemist' and 'Computer Networks' price  6.Exit\n");
			System.out.println("Enter your choice: ");
			choice =scnr.nextInt();
			
			switch(choice) {
			case 1:
				book=null;
				book=new Book();
				System.out.println("Enter book id,book name,author,price");
				book.setBookId(scnr.nextInt());
				scnr.nextLine();
				book.setBookName(scnr.nextLine());
				book.setBookAuthor(scnr.nextLine());
				book.setBookPrice(scnr.nextFloat());
				scnr.nextLine();
				
				bookServiceProvider.insertBookService(book);
				break;
			case 2:
				//1.get books
				bookList = bookServiceProvider.getBookService();
				System.out.println("No . of rows in the table="+bookList);
				
				//2.show books
				bookServiceProvider.showBookService(bookList);
				break;
			case 3:
				System.out.println("Enter the book Id");
				int id=scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.deleteBookService(id);
				break;
			case 4:
				System.out.println("Enter the book Id");
				int bid=scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.updateBookService(bid);
				break;
			case 5:
				bookServiceProvider.updateBooksByPriceSlashService();
				break;
			case 6:
				System.out.println("Thank you for using our application!");
				System.exit(0);
				break;
			}
		}
	}
}
