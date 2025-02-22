package javaIO;

public class IO_Class1 {
	
public static void main(String[] args) {
        
        // Using println - Moves to a new line after printing
        System.out.println("Hello, this is println!");  
        
        // Using print - Does not move to a new line
        System.out.print("This is print. ");
        System.out.print("It continues on the same line. ");
        
        // New line for better formatting
        System.out.println();
        
        // Using printf - Formats the output
        int age = 25;
        double height = 5.9;
        String name = "John";
        
        System.out.printf("My name is %s, I am %d years old, and my height is %.1f feet.\n", name, age, height);
    }

}
