package com.datastream.demo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

class Student {
	int rollno;
	String name;
	String dept;
	float avg;
}

public class DataStreamDemo {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/Users/Mrinu/Student2.txt");
		DataOutputStream dos = new DataOutputStream(fos); // DataOutputStream doesn't work independently. It need some
															// source. So here fos is source.

		/**
		 * I will create an object of a student class that I will store the information
		 * using this data output stream.
		 */

		Student s = new Student();
		s.rollno = 10;
		s.name = "John";
		s.dept = "CSE";
		s.avg = 80.5f;

		dos.writeInt(s.rollno);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		dos.writeFloat(s.avg);

		dos.close();
		fos.close();

	}

}
