package javaFIleHandle;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileHandle_Class3_ReadFile {
	public static void main(String[] args)
    {
		try {

            FileWriter write = new FileWriter("myfile.txt");

            // Writing File
            write.write("Files in Java are seriously good!!");
            write.close();
            
            System.out.println("Successfully written.");
        }

        // Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
