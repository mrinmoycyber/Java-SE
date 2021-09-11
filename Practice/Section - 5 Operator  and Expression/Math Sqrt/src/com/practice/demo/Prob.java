// Math.sqrt

package com.practice.demo;

import java.util.Scanner;

public class Prob {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float s, area;

		System.out.println("Enter three sides of a triangle ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		s =  (float)(a + b + c) / 2; // triangle another formula
		area= (float)Math.sqrt(s*(s-a)*(s-b)*(s-c)); // remember sqrt always return double result
		System.out.println("Area of a triangle " + area);

		sc.close();

	}

}
