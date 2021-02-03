//Rotating an Array

package com.mrinu;

public class RtatingArray {

	public static void main(String[] args) {
		int A[] = { 5, 9, 6, 10, 12, 7, 3, 5, 4, 2 };
		for (int x : A)
			System.out.print(x + ",");
		System.out.println("");

		int temp = A[0];
		for (int i = 1; i < A.length; i++) {
			A[i - 1] = A[i];
		}
		A[A.length - 1] = temp;
		// A[A.length-1]because the length of this array is 10 and we have to copy it
		// 9th index. That's value whatever we have taken in temp.

		for (int x : A)
			System.out.print(x + ",");
		System.out.println("");

	}
}
