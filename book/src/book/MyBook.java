package book;

public class MyBook {
	String firstName;
	String lastName;
	String bookTitle;
	
	String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String getBookTitle() {
		return bookTitle;
	}

	void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	
	
	MyBook(){
		
	}
	
	MyBook(String FirstName, String LastName, String bookTitle){
	
	}

}
