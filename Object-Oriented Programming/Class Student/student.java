package com.mrinu;

class Students {
	public int roll;
	public String name;
	public String course;
	public int m1, m2, m3;

	public int total() {
		return m1 + m2 + m3;
	}

	public float average() {
		return (float) total() / 3; // total gives integer. So typecast it as (float) and return it
	}

	public char grade() {
		if (average() >= 60)
			return 'A';
		else
			return 'B';
	}

	public String details() {
		return "Roll No: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
	}
}

public class Student {

	public static void main(String[] args) {

		Students s = new Students();
		s.roll = 1;
		s.name = "John";
		s.course = "CS";
		s.m1 = 70;
		s.m2 = 65;
		s.m3 = 90;

		System.out.println("Total: " + s.total());
		System.out.println("Average: " + s.average());
		System.out.println("Details: " + s.details());
	}

}
