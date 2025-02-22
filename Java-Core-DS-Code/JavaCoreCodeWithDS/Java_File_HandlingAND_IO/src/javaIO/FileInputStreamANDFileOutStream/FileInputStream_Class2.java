package javaIO.FileInputStreamANDFileOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Class2 {
	
	public static void main(String[] args)
    {

        // Use try-with-resources to handle resource
        // management
        try (FileInputStream fi
             = new FileInputStream("test.txt")) {

            // Illustrating getChannel() method
            System.out.println("Channel: "
                               + fi.getChannel());

            // Illustrating getFD() method
            System.out.println("File Descriptor: "
                               + fi.getFD());

            // Illustrating available method
            System.out.println("Number of remaining bytes: "
                               + fi.available());

            // Illustrating skip() method
            fi.skip(4);

            System.out.println("File Contents:");

            // Reading characters from FileInputStream
            int ch;
            while ((ch = fi.read()) != -1) {
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(
                "File not found: Ensure 'file1.txt' exists in the working directory.");
        }
        catch (IOException e) {
            System.out.println(
                "An error occurred while reading the file: "
                + e.getMessage());
        }
    }

}
