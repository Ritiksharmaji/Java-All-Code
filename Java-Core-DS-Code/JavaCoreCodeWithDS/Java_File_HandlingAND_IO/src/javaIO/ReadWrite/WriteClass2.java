package javaIO.ReadWrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class WriteClass2 {
	public static void main(String[] args)
	        throws IOException
	    {

	        // Writer to output to the console
	        Writer w = new PrintWriter(System.out);

	        System.out.println("Example 1: append(char)");

	        // Appending Characters
	        w.append('G');
	        w.append('e');
	        w.append('e');
	        w.append('k');
	        w.append('s');
	        w.flush();

	        System.out.println();

	        System.out.println(
	            "Example 2: append(CharSequence)");
	        CharSequence t = "Hello, Geeks!";

	        // Appending entire CharSequence
	        w.append(t);
	        w.flush();

	        System.out.println();

	        System.out.println(
	            "Example 3: append(CharSequence, start, end)");

	        // Appending substring "Hello"
	        w.append(t, 0, 5);
	        w.append(" ");

	        // Appending substring "Geeks"
	        w.append(t, 7, 12);
	        w.flush();

	        System.out.println();

	        // Close the writer
	        w.close();
	    }
}
