package javaIO.ReadWrite;

import java.io.FileReader;
import java.io.Reader;

public class ReadClass3 {
    public static void main(String[] args) {
    	 // ASCII range for digits (0-9)
        char startDigit = '0';
        char endDigit = '9';

        // ASCII range for uppercase letters (A-Z)
        char startUpper = 'A';
        char endUpper = 'Z';

        // ASCII range for lowercase letters (a-z)
        char startLower = 'a';
        char endLower = 'z';

        // ASCII range for common special characters
        char startSpecial = '!';
        char endSpecial = '/';  // Example range for special characters

        // Printing ASCII values
        System.out.println("ASCII Range of Digits: '" + startDigit 
        		+ "' (" + (int)startDigit + ") to '" 
                           + endDigit + "' (" + (int)endDigit + ")");

        System.out.println("ASCII Range of Uppercase Letters: '" 
        + startUpper + "' (" + (int)startUpper + ") to '"
                           + endUpper + "' (" + (int)endUpper + ")");

        System.out.println("ASCII Range of Lowercase Letters: '" 
        + startLower + "' (" + (int)startLower + ") to '"
                           + endLower + "' (" + (int)endLower + ")");

        System.out.println("ASCII Range of Special Characters: '" 
        + startSpecial + "' (" + (int)startSpecial + ") to '"
                           + endSpecial + "' (" + (int)endSpecial + ")");
            
        
    }
}
