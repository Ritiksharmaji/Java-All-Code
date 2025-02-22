package javaFIleHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandle_Class4_WriteFile {
	public static void main(String[] args)
    {
		try {
            File fileobject = new File("myfile.txt");
            Scanner Reader = new Scanner(fileobject);
           
         // Traversing File Data
            while (Reader.hasNextLine()) {
              String data = Reader.nextLine();
              System.out.println(data);
            }
            Reader.close();
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
