//Finding Sum of all elements

package com.mrinu;

public class SumElements {

	public static void main(String[] args) {
		int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
		int sum = 0;
		for (int i = 0; i < A.length; i++) { // traversing
			sum = sum + A[i]; // traversing
		} // traversing
		System.out.println("Sum is " + sum); // once the traversing is finished, then only we can print the result.
		/*for (int x:A) {
		  sum=sum+x;
		  }
		System.out.println("Sum is " + sum);*/
	}

}
