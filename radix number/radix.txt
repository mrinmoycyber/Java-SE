//Find radix of a given number

package com.radix.number;

import java.util.Scanner;

public class RadixNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		System.out.println("Enter a number");
		num = sc.nextLine();
		if (num.matches("[01]+")) {
			System.out.println("Binary Radix=2");
		} else if (num.matches("[0-7]+")) {
			System.out.println("Octal Radix");
		} else if (num.matches("[0-9]+")) {
			System.out.println("Decimal Radix=10");
		} else if (num.matches("[0-9A-F]+")) {
			System.out.println("Hexa Radix=16");
		} else {
			System.out.println("Not a numer");
		}
	}

}
