package com.file.example;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("Source1.txt");
		FileInputStream fis2 = new FileInputStream("Source2.txt");
		FileOutputStream fos = new FileOutputStream("Destination.txt");
        
		/**
		 * It will read the data from fis1 first, if it has finished then 
		 * it will start reading the data from second one.
		 */
		
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		
		int b;
		
		/**
		 * SequenceInputStream.read until it becomes minus one.So when it will become minus one 
		 * once it has finish reading from second file. After second file it will become minus one.
		 */
		
		while ((b = sis.read()) != -1) {

			fos.write(b);
			
		}

		sis.close();
		fis1.close();
		fis2.close();
		fos.close();

	}

}
