package com.serilisation.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private int rollno;
	private String name;
	private float avg;
	private String dept;
	public static int Data = 10; // static value will not be stored
	public transient int t; // transient value will not be stored

	/**
	 * non parameterized constructor is not mandatory for this class. If there is a
	 * parent class, then it's mandatory. But it's a good practice to leave a non
	 * parameterized constructor.
	 */

	public Student() {}

	/**
	 * @param r
	 * @param n
	 * @param a
	 * @param d
	 */

	public Student(int r, String n, float a, String d) {

		rollno = r;
		name = n;
		avg = a;
		dept = d;
		Data = 500; // not stored
		t = 500; // not stored

	}

	// Displaying the details of all student

	public String toString() {
		return "\nStudent Details\n" + "\nRoll " + rollno + "\nName " + name + "\nAverage " + avg + "\nDept " + dept
				+ "\nData " + Data + "\nTransient " + t + "\n";

	}

}

public class ObjectDemo {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/Users/Mrinu/Student3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student s = new Student(10, "John", 89.9f, "CSE");

		// Stored or serialize this object [ student object ] by using object output stream
		oos.writeObject(s); // this will achieve serialization

		fos.close();
		oos.close();

	}

}
