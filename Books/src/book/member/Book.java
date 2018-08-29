package book.member;

import java.util.Scanner;

public class Book {
	private String title;
	private boolean isIssued = false;
	public static String name;
	Scanner sc = new Scanner(System.in);
	Member m1 = new Member();

	void getBook() {
		if (title != null)
			System.out.println("Book added is " + title);
		else
			System.out.println("No book present...");
	}

	void getMember() {
		if (isIssued == true)
			System.out.println("Book is issued to " + name);
		else
			System.out.println("Book not issued to anyone");
	}

	void issueBook(String name) {
		if (isIssued == false) {
			m1.book = title;
			this.name = name;
			isIssued = true;
		} else
			System.out.println("Book already issued to " + this.name);
	}

	void addBook() {
		System.out.println("Enter book");
		this.title = sc.next();
	}

	void returnBook() {
		if (m1.book != null) {
			m1.book = null;
			isIssued = false;
			System.out.println("Book reutrned successfully.");
		} else
			System.out.println("Don't have any book.");

	}

}
