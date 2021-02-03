/*REVERSE A NUMBER

      n         r= n%10           rev                       n=n/10
 * 237          7                0*10+7=7                  23
 * 23             3               7*10+3=73                 2
 * 2               2                73*10+2=732            0
 * rev=rev*10+r                                 */

package com.mrinu;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int rev = 0, r;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		System.out.println(rev);
	}

}
