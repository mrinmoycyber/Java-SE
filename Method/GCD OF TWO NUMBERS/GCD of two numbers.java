//Find GCD of 2 numbers
//both m & n value will be equal 
// m=25 and n=15
//m=25-15 & n= 15
//m=10 & n=15-10
//m=10-5 & n=5
//m=5 & n=5

package com.mrinu;

public class GcdOfTwoNumbers {
	int gcd(int m, int n) {
		while (m != n) {
			if (m > n)
				m = m - n;

			else
				n = n - m;
		}
		return m; // Both are equal.. It will come out when m and n are equal. So we can return
					// any value.. either m or n
	}

	public static void main(String[] args) {
		GcdOfTwoNumbers x =new GcdOfTwoNumbers(); //create object of the class
		System.out.println(x.gcd(25, 50));

	}

}
