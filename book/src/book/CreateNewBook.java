package book;

public class CreateNewBook {

	public static void main(String[] args) {
	 MyBook book = new MyBook("Jk", "Rowling", "Harry Potter");
		book.setBookTitle("Harry Potter");
		book.setFirstName("JK");
		book.setLastName("Rowling");
		
		System.out.println(book);

	}

}
