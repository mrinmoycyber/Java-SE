package com.bytedemo;

import java.io.*;

public class ByteDemo {

	public static void main(String[] args) throws Exception {

		/**
		 *It will create a byte array by itself. Suppose if we want to give the size we can  mention the size
		 *and I will mention the size as 20. So it will have its own byte array  where it will store the data.
		 */
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
          
	    bos.write('a');
	    bos.write('b');
	    bos.write('c');
	    bos.write('d');
         
	    //For see those letters ['a', 'b', ...]
		byte b[] = bos.toByteArray(); // returns array of byte
		
		for(byte x:b)
			System.out.println((char)x);
		
		bos.close();

	}

}
