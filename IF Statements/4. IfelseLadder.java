package importScanner;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*
		 * int num; Scanner obj = new Scanner(System.in);
		 * System.out.println("Enter a number"); num = obj.nextInt();
		 */

		// Nested If
		int number1 = 5;
		if (number1 > 5) {
			System.out.println(">5");
		} else if (number1 < 5) {
			System.out.println("<5");
		} else if (number1 == 5) {
			System.out.println("=5");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
