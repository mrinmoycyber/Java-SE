//Multiplication of two arrays

package com.mrinu;

public class MultiplicationTwoArrays {

	public static void main(String[] args) {
		int A[][] = { { 3, 5, 9 }, { 4, 8, 7 }, { 5, 6, 7 } };
		int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int C[][] = new int[3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {

				for (int k = 0; k < A.length; k++) {
					C[i][j] = C[i][j] + A[i][j] * B[k][j]; // we have to add multiple no. of elements.. that's why we are adding C[i][j]

				}
			}
		}
		for (int x[] : C) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println("");
		}
	}

}
