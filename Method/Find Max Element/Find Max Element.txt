package com.mrinu;

public class MaxElement {
	int max(int A[]) {

		int max = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int A[] = { 3, 9, 7, 8, 25, 5, 4, 10 };
		MaxElement x = new MaxElement();
		System.out.println(x.max(A));

	}

}
