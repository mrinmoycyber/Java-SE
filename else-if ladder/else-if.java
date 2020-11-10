package com.ladder;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		int marks;
		char grade;
		System.out.println("Enter Marks");
		marks = obj.nextInt();
		if (marks >= 85) {
			grade = 'A';
		} else if (marks >= 75) {
			grade = 'B';
		} else if (marks >= 65) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("Grade" +grade);

	}

}
