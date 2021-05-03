package com.bufferreader.demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {

		/**
		 * FileInputStream and FileReader both are perform the same role but some
		 * different than their behavior.Like this BufferedReader is used for characters
		 * or file reader is used for characters. So when we really have a unique codes,
		 * Then these are much useful. If we have just bites, that is ASCII code
		 * bites.Then we can go with bite BufferInputStream and FileInputStream.
		 */

		FileReader fis = new FileReader("C:/Users/Mrinu/Test.txt");
		BufferedReader bis = new BufferedReader(fis);

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

		System.out.print((char) bis.read()); // again print r
		System.out.print((char) bis.read()); // again print n

		System.out.println("String " + bis.readLine()); // read lines from your file or from the stream.

	}

}
