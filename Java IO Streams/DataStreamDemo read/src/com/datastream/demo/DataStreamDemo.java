package com.datastream.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;

class Student {
	int rollno;
	String name;
	String dept;
	float avg;
}

public class DataStreamDemo {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/Mrinu/Student2.txt");
		DataInputStream dis = new DataInputStream(fis);

		Student s = new Student();

		s.rollno = dis.readInt();
		s.name = dis.readUTF();
		s.dept = dis.readUTF();
		s.avg = dis.readFloat();

		System.out.println("Roll no: " + s.rollno);
		System.out.println("Name: " + s.name);
		System.out.println("Dept: " + s.dept);
		System.out.println("Average: " + s.avg);

		dis.close();
		fis.close();

	}

}
