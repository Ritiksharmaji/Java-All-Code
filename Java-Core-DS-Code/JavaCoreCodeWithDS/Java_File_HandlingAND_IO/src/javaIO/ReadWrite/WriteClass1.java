package javaIO.ReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class WriteClass1 {
	public static void main(String[] args)
    {
        try {
          
            // Create a FileWriter to write to a file named "example.txt"
            FileWriter w = new FileWriter("example.txt");

            // Write a simple message to the file
            w.write("Hello, World!");
            w.close();
            System.out.println( "Geeks for Geeks");               
        }
        catch (IOException e) {
            System.out.println("An error occurred: "
                               + e.getMessage());
        }
    }
}
