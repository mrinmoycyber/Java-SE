//Adding two matrices
// If both the matrices are same order, then only they can be added or subtracted.
//If they are of different dimension , you cannot perform additional subtraction operation.
package com.mrinu;

public class TwoDimensional {

	public static void main(String[] args) {
		int A[][]={{3,2,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,3},{3,9,7}};
		int C [] [] = new int[3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) { // A[0]- I can take any row of the size
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for (int x[] : C) {
			for (int y : x) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}

}
