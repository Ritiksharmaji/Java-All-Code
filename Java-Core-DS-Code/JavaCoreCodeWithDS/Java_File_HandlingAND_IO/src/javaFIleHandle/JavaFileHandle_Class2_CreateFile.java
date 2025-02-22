package javaFIleHandle;
import java.io.File;
import java.io.IOException;

public class JavaFileHandle_Class2_CreateFile {
	public static void main(String[] args)
    {
		// Creating the File also  Handling Exception
      try {
          File Obj = new File("myfile.txt");
          
            // Creating File
            if (Obj.createNewFile()) {
              System.out.println("File created: " + Obj.getName());
          }
          else {
              System.out.println("File already exists.");
          }
      }
      catch (IOException e) {
          System.out.println("An error has occurred.");
          e.printStackTrace();
      }
    }
}
