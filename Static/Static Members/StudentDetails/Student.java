package com.StudentDetails;

import java.util.Date;

class StudentDetails {
	private String rollNo;

	private static int count = 1;

	private String assignRollNo() {
		Date d = new Date();

		String rno = "Univ-" + (d.getYear() + 1900) + "-" + count;
		count++;
		return rno;
	}

	StudentDetails() {
		rollNo = assignRollNo();
	}

	public String getRollNo() {
		return rollNo;
	}
}

public class Student {
	public static void main(String[] args) {
		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails();
		StudentDetails s3 = new StudentDetails();

		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());

	}

}
