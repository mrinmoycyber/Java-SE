//Deleting an Element

package com.mrinu;

import java.util.Scanner;

public class DeletingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;

		int ele = sc.nextInt();

//Shifting elements 
		for (int i = ele; i < A.length; i++) {
			A[i-1] = A[i];
		}

		for (int x : A) {
			System.out.print(x + " ");
		}
	}
}
