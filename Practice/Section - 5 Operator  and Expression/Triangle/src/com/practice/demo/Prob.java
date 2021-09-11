// Area of a triangle

package com.practice.demo;

import java.util.Scanner;

public class Prob {

	public static void main(String args[]) {

		float base, height, area;
		Scanner sc = new Scanner(System.in);
		base = sc.nextFloat();
		height = sc.nextFloat();

		area = base * height / 2;  // always use this formula

		System.out.println("Area of a triangle "+area);

		sc.close();

	}

}
