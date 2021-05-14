package com.filehandling.demo;

import java.io.*;

public class FileHandling {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\Mrinu");
		System.out.println(f.isDirectory());

		// It will give array of strings in return
		String list[] = f.list();

		// For print all those file names

		for (String x : list) {
			System.out.println(x);
		}
		
		// Instead of String we can take array of files
		
		File list1[] = f.listFiles();
		
		for(File x:list1) {
			System.out.print(x.getName()+" ");
			System.out.println(x.getPath());
			System.out.println(x.getParent());
			}

		// If a file is read only then we can change it to writable
		
		File g = new File("C:\\Users\\Mrinu\\Data.txt");
		
		//g.setReadOnly();
     	
		g.setWritable(true);
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Mrinu\\\\Data.txt");

	}

}
