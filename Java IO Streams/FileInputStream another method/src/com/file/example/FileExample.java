/**
 * I will read the bytes from a file letter by letter.
 */

package com.file.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		  try(FileInputStream fis=new FileInputStream("C:/Users/Mrinu/Test.txt");)
	        {
	        
			  int x;
			  
			  /**
			   * I will read byte by byte from a file and I will also print it.
			   */
			  
			  do {
				  x=fis.read();
				  if(x!=-1)
				  System.out.print((char)x); //Ascii code converted into character and display
			  } while (x!=-1); // continue as long as x is not -1.
			   
			  /*while ((x=fis.read()) !=-1)
			   * {
			   * System.out.print((char)x);
			   * }*/
	        }
	    
	}

}
