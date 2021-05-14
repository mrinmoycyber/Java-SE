package com.radomaccess.demo;

import java.io.*;

public class RandomAccessDemo {

	public static void main(String[] args) throws Exception {

		RandomAccessFile rf = new RandomAccessFile("C:\\Users\\Mrinu\\Data.txt", "rw");

		System.out.println((char) rf.read()); // Typecast it because it will read bytes value
		System.out.println((char) rf.read());
		System.out.println((char) rf.read());

		rf.write('d'); // check cmd prompt ABCDEFGH -> d in lower case [ type cmd -> type Data.txt
						// (video 233) ]
		System.out.println((char) rf.read()); // we will not get d in o/p because we are writing it.

		// Let's skip some bytes
		// byte B[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}

		rf.skipBytes(3);
		System.out.println((char) rf.read());

		rf.seek(3); // I will take the pointer to 'd'
		System.out.println((char) rf.read());

		// Now my new file position
		System.out.println(rf.getFilePointer()); // It stand on 'E' byte number -> 4
		
		rf.seek(rf.getFilePointer()+2);
		System.out.println((char) rf.read());

	}

}
