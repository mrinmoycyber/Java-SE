/** Roots of Quadratic Equation
 * bsquare - 4ac cannot be negative
**/

package com.practice.demo;

import java.util.Scanner;

public class Prob {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double r1, r2;

		System.out.println("Enter values of a, b and c ");  // Give proper values otherwise o/p will be NaN
		a = sc.nextInt(); // 1
		b = sc.nextInt();  // 5
		c = sc.nextInt();   // 6

		r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		System.out.println("Root are " + r1 + " " + r2);

		sc.close();

	}

}
