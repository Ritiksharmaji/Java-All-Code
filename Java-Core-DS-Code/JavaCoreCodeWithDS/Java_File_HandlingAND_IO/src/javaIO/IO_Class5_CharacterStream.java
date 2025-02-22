package javaIO;
import java.io.FileReader;
import java.io.IOException;
public class IO_Class5_CharacterStream {
	public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
          try {
            sourceStream = new FileReader("test.txt");
  // Reading sourcefile and writing content to target file character by character.
     
            int temp;
            while (( temp = sourceStream.read())!= -1 )
                System.out.println((char)temp); 
        }
        finally {
          
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
