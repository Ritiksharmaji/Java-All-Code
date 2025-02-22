package javaIO.ReadWrite;

import java.io.FileReader;
import java.io.Reader;

public class ReadClass2_ASCII3 {
    public static void main(String[] args) {
    	// Loop through ASCII values from 0 to 127
        for (int i = 127; i <= 256; i++) {
            // Cast the integer to a character
            char character = (char) i;

            // Print the integer and the corresponding character
            System.out.println("ASCII Value: " + i + " | Character: " + character);
            
        }
    }
}
