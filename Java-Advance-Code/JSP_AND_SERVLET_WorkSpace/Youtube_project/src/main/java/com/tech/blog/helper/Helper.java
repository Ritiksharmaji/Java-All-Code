package com.tech.blog.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Helper {
	
	public static  boolean delete_file(String path) {
		// here path is nothing nut old image address
		boolean f =false;
		
		try {
			
			File file = new File(path);
			f = file.delete();
			// if file deleted the it return as true else false..
			
		}catch(Exception e) {
			System.out.println("Delete method error:"+e);
		}
		
		return f;
		
	}
	
	public static boolean save_file(InputStream is,String path) {
		
		boolean f = false;
		
		try {
			
			byte b[] = new byte[is.available()];
			
			is.read(b);
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(b);
			fos.flush();
			fos.close();
			
			f = true;
			
		}catch(Exception e) {
			System.out.println("save method error:"+e);
		}
		
		return f;
	}

	
	

}
