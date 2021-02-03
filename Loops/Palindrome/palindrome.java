/*If the reverse of a number is equal to of a number, then it's PALINDROME  number. Ex- n=12521  rev=12521*/

package com.mrinu;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0, r;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		if (temp == rev) {
			System.out.println("It's a Palindromne");
		} else {
			System.out.println("It's not a Palindrome");
		}
	}

}
