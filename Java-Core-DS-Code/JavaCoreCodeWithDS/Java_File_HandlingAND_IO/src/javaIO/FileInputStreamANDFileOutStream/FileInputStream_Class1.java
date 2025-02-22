package javaIO.FileInputStreamANDFileOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Class1 {
	
	public static void main(String[] args)
    {
		try {	          
            FileInputStream fi = new FileInputStream("test.txt");
            int ch;
            while ((ch = fi.read()) != -1) {
                System.out.print((char)ch);
            }
            fi.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: Ensure the file exists.");
                
        }
        catch (IOException e) {
            System.out.println( "An error occurred while reading the file.");
               
        }
    }

}
