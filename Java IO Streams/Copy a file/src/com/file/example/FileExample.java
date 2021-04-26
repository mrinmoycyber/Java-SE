package com.file.example;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("Source1.txt");
		FileOutputStream fos = new FileOutputStream("Source2.txt");

		int b;
		
		/**
		 * Reading the data from the file using  file input stream and it will read and store the data in b.
		 * It will read until it reaches minus one.
		 */
		
		while ((b = fis.read()) != -1) {

			/**
			 * If that b is lying between 65 to 90 means its capital letters.
			 *  So add 32 to make it lower case letters.
			 *  Else if it's not within this range simply copy that character.
			 */
			
			if (b >= 65 && b <= 90)
				fos.write(b + 32);
			else
				fos.write(b);

		}

		fis.close();
		fos.close();

	}

}
