package javaIO.FileInputStreamANDFileOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream_Class1 {
	
	 public static void main(String[] args)throws IOException {
		int i;
		FileOutputStream fout = new FileOutputStream("test.txt",true);
		        // we need to transfer this string to files
		        String st = "TATA";
		 
		        char ch[] = st.toCharArray();
		        for (i = 0; i < st.length(); i++) {
		           
		            // we will write the string by writing each
		            // character one by one to file
		            fout.write(ch[i]);
		        }
		       
		        // by doing fout.close() all the changes which have
		        // been made till now in RAM had been now saved to
		        // hard disk
		        fout.close();
		    }
}
