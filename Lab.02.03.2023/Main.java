package Lab;

	public class Main {
	    public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook("101", "The Last Book", "Nikhil Sharma");
	        library.displayBook();
	    }
	}

	class Library {
	    private String bookId;
	    private String bookName;
	    private String bookAuthor;
	    private boolean isAvailable;

	    public void addBook(String id, String name, String author) {
	        bookId = id;
	        bookName = name;
	        bookAuthor = author;
	        isAvailable = true;
	    }

	    public void displayBook() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Book Name: " + bookName);
	        System.out.println("Book Author: " + bookAuthor);
	        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
	    }
	}


