package com.mrinu;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		long fact = 1; // for finding factorial we declare  a variable and initially its value is 1. 
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is "+fact);
	}

}
