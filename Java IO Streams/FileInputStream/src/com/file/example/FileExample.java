package com.file.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		  try(FileInputStream fis=new FileInputStream("C:/Users/Mrinu/Test.txt");)
	        {
	        
			  /**
			   * I will create an byte array  equal to the available number of bytes inside 
			   * file InputStream. So I have taken an array object is created  and that is given to this
			   * file InputStream read method which will read all the bytes from a  file and 
			   * it will store in this array and yes the array and the array is having that much capacity
			   */
			  
			  byte b[] = new byte[fis.available()];
			  fis.read(b);
			  
			  // Byte array converting it to a String
			   String str = new String (b);
			   System.out.println(str);
			   
	        }
	    
	}

}
