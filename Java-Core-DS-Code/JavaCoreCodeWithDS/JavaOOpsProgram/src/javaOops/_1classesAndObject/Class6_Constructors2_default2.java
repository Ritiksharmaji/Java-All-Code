package javaOops._1classesAndObject;

class Book1 {
    // Fields (Instance Variables)
    String title;
    String author;
    double price;

    
 // Default Constructor
    public Book1() {
        title = "Unknown Title";   // Default value
        author = "Unknown Author"; // Default value
        price = 0.0;               // Default value
    }
    

    // Method to display book details
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Class6_Constructors2_default2 {
	
	 public static void main(String[] args) {
	        // Creating an object using the default constructor
		 Book1 myBook = new Book1();
	        
	        // Printing default values
	        myBook.display();
	    }
}
