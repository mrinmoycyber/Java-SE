//Overloaded method to reverse an integer or array

package com.mrinu;

public class Reverse {
	int reverse(int n) {
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return rev;
	}

	int[] reverse(int A[]) {
		int B[] = new int[A.length];
		for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
			B[j] = A[i];
		}
		return B;
	}

	public static void main(String[] args) {
		Reverse a = new Reverse();
		System.out.println(a.reverse(18));
		int someArray[] = { 3, 4, 5, 10 };
		for (int i : someArray) {
			System.out.print(i + " ");
		}
		int x[] = a.reverse(someArray);
		System.out.print("\n");
		for (int i : x) {
			System.out.print(i + " ");
		}
	}

}
