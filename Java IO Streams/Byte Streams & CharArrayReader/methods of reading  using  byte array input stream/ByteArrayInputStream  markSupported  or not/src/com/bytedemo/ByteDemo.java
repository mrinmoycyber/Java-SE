package com.bytedemo;

import java.io.*;

public class ByteDemo {

	public static void main(String[] args) throws Exception {

		// Source of data
		byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

		/**
		 * I will attach byte input stream to this array and read the data from this
		 * byte array. Normally when we access a bite array, we can use a for loop and
		 * access all the bytes in an array or even we can use for each loop. But now
		 * that same array is treated like a stream with the help of byte array stream
		 * class.
		 */

		// Create an object of ByteArray InputStream
		ByteArrayInputStream bis = new ByteArrayInputStream(b);

//	   // Reading one byte at a time
//		int x;
//		while ((x = bis.read()) != -1) {
//			System.out.print((char) x);
//		}
//
//		bis.close();

		// Reading all the bytes together

		/**
		 * I will take this byte array and make it as String
		 */

		String str = new String(bis.readAllBytes());
		
		/**
		 *o/p - > True because it's an array we can read  the data multiple times, so same data we can read 
		 *it again but that's not the case with file in the file, you will have a file pointer. 
		 *It will be moving forward, we cannot come back. 
		 */
		
		System.out.println(bis.markSupported());
		
		bis.close();

	}

}
