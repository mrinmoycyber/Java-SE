package com.mrinu;

public class SumElements {
	public int sum(int... A) {
		int s = 0;
		for (int i = 0; i < A.length; i++) {
			s += A[i];
		}
		return s;
	}

	public static void main(String[] args) {
		SumElements ab = new SumElements();
		System.out.println(ab.sum(1, 2));
		System.out.println(ab.sum(1, 2, 5, 9));
	}

}
