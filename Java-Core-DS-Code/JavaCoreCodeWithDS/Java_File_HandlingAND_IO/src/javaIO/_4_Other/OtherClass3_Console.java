package javaIO._4_Other;
import java.io.Console;
import java.io.IOException;

public class OtherClass3_Console {
	
	public static void main(String[] args)throws IOException{
		// Get the Console instance
        Console console = System.console();
        
        // Check if console is available (not available in IDEs like Eclipse)
        if (console == null) {
            System.out.println("No console available. Run from the command line.");
            return;
        }

        // Read a line of text
        String name = console.readLine("Enter your name: ");

        // Read password (hidden input)
        char[] password = console.readPassword("Enter your password: ");

        // Convert password char array to String 
        //(Avoid storing passwords like this in real-world apps)
        String passStr = new String(password);

        // Print user input
        console.printf("Welcome, %s!%n", name);
        console.printf("Your password is: %s%n", passStr); 
        // Normally, you should not print passwords!
	    }

}
