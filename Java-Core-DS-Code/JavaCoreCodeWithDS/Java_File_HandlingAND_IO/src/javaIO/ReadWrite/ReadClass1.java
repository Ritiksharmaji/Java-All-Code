package javaIO.ReadWrite;

import java.io.FileReader;
import java.io.Reader;

public class ReadClass1 {
    public static void main(String[] args) {
        try {
            // Create a FileReader object
            Reader r = new FileReader("test.txt");

            // Read one character at a time from the file
            int data = r.read();

            // Print the first character and its Unicode value
            System.out.println("Character: " + (char) data + " | Unicode: " + data);

            while (data != -1) {
                // Convert the int to char and print
                System.out.print((char) data);
                data = r.read();  // Read next character
            }

            // Close the reader
            r.close();
        } catch (Exception ex) {
            // Handle any IO exceptions
            System.out.println("An error occurred: " + ex.getMessage());
        }
    }
}
