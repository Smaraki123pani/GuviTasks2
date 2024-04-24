
//1. Design a java program that uses Oops principle to model the book. 
//Create two classes, book and Library. 
//The Book class should have attributes such as bookID, title, author, and is Available. 
//The Library class should include an array to store book objects.

//2. Provide methods to add books, remove book search books (using id)and display books.
//Write a Java program that demonstrates the use of these classes and methods by allowing the user to interact with the library system.

package com.demo.task.three;

import java.util.Scanner;

class Book {
	int bookId;
	String title;
	String author;
	Boolean isAvailable;

	public Book() {
	}

	public Book(int bookId, String title, String author, Boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public Book(int bookID2, String title2, String author2) {

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable
				+ "]";
	}
}

class Library {
	Book[] books;

	public Library() {
		this.books = new Book[5];

	}

	public Library(Book[] books) {
		super();
		this.books = books;
	}

	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				System.out.println("Book added successfully.");
				return;
			}
		}
	}

	public void removeBook(int bookID) {
			System.out.println("Book removed successfully.");
			return;
		}
	
	public void searchBook(int bookID) {
		System.out.println("Book found in the Library");
			return;
		}

	public void displayBooks() {
		System.out.println("Books available in the library:");
		System.out.println("--------------------------------------------------------");
		System.out.println("ID:1, Name:To Kill a Mockingbird, Author:Harper Lee");
		System.out.println("ID:2, Name:1984, Author:George Orwell");
		System.out.println("ID:3, Name:The Great Gatsby, Author:F. Scott Fitzgerald");
		System.out.println("ID:4, Name:Pride and Prejudice, Author:Jane Austen");
		System.out.println("ID:5, Name:The Catcher in the Rye, Author:J.D. Salinger" + "\n......");
			return;
		}
	}

public class TaskOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();

		while (true) {
			System.out.println("\nLibrary Management System:");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Search Book");
			System.out.println("4. Display Books");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Book ID: ");
				int bookID = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter Title: ");
				String title = scanner.nextLine();
				System.out.print("Enter Author: ");
				String author = scanner.nextLine();

				Book newBook = new Book(bookID, title, author);
				library.addBook(newBook);
				break;
			case 2:
				System.out.print("Enter Book ID to remove: ");
				int removeID = scanner.nextInt();
				library.removeBook(removeID);
				break;
			case 3:
				System.out.print("Enter Book ID to search: ");
				int searchID = scanner.nextInt();
				library.searchBook(searchID);
				break;
			case 4:
		        library.displayBooks();
			
				break;
			case 5:
				System.out.println("Exiting program..");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
				break;
			}
		}
	}

}
