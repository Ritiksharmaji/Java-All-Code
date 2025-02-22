package javaIO.ReadWrite;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Arrays;

public class ReadClass2_ASCII4 {
	public static void main(String[] args)
	        throws IOException
	    {

	        // Open a file reader
	        Reader r = new FileReader("test.txt");
	        PrintStream out = System.out;

	        // Create a character array and CharBuffer
	        char[] buffer = new char[10];
	        CharBuffer charBuffer = CharBuffer.wrap(buffer);

	        // Check if the reader supports marking
	        if (r.markSupported()) {
	            r.mark(100); // Mark the current position
	            out.println("mark method is supported");
	        }

	        // Skip 5 characters in the stream
	        r.skip(5);

	        // Check if the stream is ready to read
	        if (r.ready()) {
	            // Read 10 characters into the buffer
	            r.read(buffer, 0, 10);
	            out.println("Buffer after reading 10 chars: "
	                        + Arrays.toString(buffer));

	            // Read characters into the CharBuffer
	            r.read(charBuffer);
	            out.println(
	                "CharBuffer contents: "
	                + Arrays.toString(charBuffer.array()));

	            // Read a single character
	            out.println("Next character: "
	                        + (char)r.read());
	        }

	        // Close the reader
	        r.close();
	    }
}
