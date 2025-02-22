package javaFIleHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandle_Class5_DeleteFile {
	public static void main(String[] args)
    {
		File Obj = new File("myfile.txt");
        
        // Deleting File
        if (Obj.delete()) {
            System.out.println("The deleted file is : " + Obj.getName());
        }
        else {
            System.out.println(
                "Failed in deleting the file.");
        }
    }
}
