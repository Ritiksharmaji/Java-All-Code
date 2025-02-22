package javaIO._4_Other;
import java.io.Console;
import java.io.IOException;

public class OtherClass5_DataInputStream {
	
	public static void main(String[] args)throws IOException{
		// check if length of args array is
        // greater than 0
        if (args.length > 0) {
            System.out.println(
                "The command line arguments are:");

            // iterating the args array and printing
            // the command line arguments
            for (String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
	    }

}
