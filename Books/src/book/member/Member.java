package book.member;

public class Member {
	private String name;
	public static String book;

	void getBook() {
		if (book != null)
			System.out.println("Issued book is " + book);
		else
			System.out.println("No book issued to user.");
	}

}
