package javaOops._1classesAndObject;

class Book {
    // Fields (Instance Variables)
    String title;
    String author;
    double price;

 // Default Constructor
    public Book() {
       System.out.println("constructer called:");
    }

    // Method to display book details
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class Class6_Constructors2_default {
	
	 public static void main(String[] args) {
	        // Creating an object using the default constructor
	        Book myBook = new Book();
	        
	        // Printing default values
	        myBook.display();
	    }
}
