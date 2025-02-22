package javaIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class IO_Class5_ByteStream {
	 public static void main(String[] args) throws IOException {   
		        FileInputStream sourceStream = null;
		        FileOutputStream targetStream = null;
		        try {
		            sourceStream  = new FileInputStream("sorcefile.txt");  
		            targetStream = new FileOutputStream("targetfile.txt");
		 // Reading source file and writing content to target file byte by byte     
		            int temp;
		            while ((temp = sourceStream.read()) != -1)
		            	 targetStream.write((byte)temp);
		        	}
		        finally {
		            if (sourceStream != null)
		                sourceStream.close();
		            if (targetStream != null)
		                targetStream.close();
		        }
		    }
}
