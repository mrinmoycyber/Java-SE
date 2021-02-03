package com.mrinu;

import java.util.Scanner;

public class DisplayDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int r;
		while (n > 0) { // 257
			r = n % 10; /*
						 * 257/10 (rem- 7) If I find out remainder by using mod 10, then I get a digit
						 * seven But remember I can get only last digit.(Ex-7)
						 */
			n = n / 10; /*
						 * 257/10 (25) HOW TO GET A NEXT NUMBER? we can't take out five unless you
						 * remove seven from this number unless we divide the number 257/10, then we
						 * will get the number 25
						 */
			System.out.println(r);
		}
		System.out.println(n);
	}

}
