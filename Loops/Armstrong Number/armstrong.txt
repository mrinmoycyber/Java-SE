// Armstrong number
/*
    153 -> 1 5 3
           1*1*1 + 5*5*5 + 3*3*3
           1 + 125 +27
           153
           
    370 -> 3*3*3 + 7*7*7 + 0
           27 + 343
           370
*/

package com.mrinu;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int r, sum = 0;
		while (n > 0) {

			r = n % 10; // 
			n = n / 10; // 
			sum = sum + r * r * r;
		}
		if (temp == sum) {

			System.out.println("Its an Armstrong Number");
		}

		else {
			System.out.println("Not an Armstrong number");

		}
	}

}
