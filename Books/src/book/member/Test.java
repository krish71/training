package book.member;

public class Test {

	public static void main(String[] args) {
		Book b1 = new Book();
		Member m = new Member();

		b1.getBook();
		b1.addBook();
		b1.issueBook("Nilesh");
		// b1.getMember();
		b1.issueBook("Krishna");
		// m.getBook();
		b1.returnBook();
		b1.issueBook("Krishna");
		b1.getMember();

	}

}
