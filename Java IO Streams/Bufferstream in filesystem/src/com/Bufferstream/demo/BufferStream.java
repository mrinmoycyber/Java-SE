package com.Bufferstream.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferStream {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/Mrinu/Test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		/**
		 * This will read first byte [ read L ]
		 */

		System.out.print((char) bis.read());
		System.out.print((char) bis.read()); // [ read E]
		System.out.print((char) bis.read()); // [ read A]
		bis.mark(10); // [ Mark is on R ]
		System.out.print((char) bis.read()); // [ read R ]
		System.out.print((char) bis.read()); // [ read N ]
		bis.reset();

		/**
		 * In buffer input stream if we are reading the letters also, we can go back and again read them.
		 * This is a proof that BufferInputStream holding the data. 
		 */

		System.out.print((char) bis.read()); // again print r 
		System.out.print((char) bis.read()); // again print n
	}

}
