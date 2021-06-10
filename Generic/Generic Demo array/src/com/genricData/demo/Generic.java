package com.genricData.demo;

class MyArray<T> {

	/**
	 * // If we don't use this [@SuppressWarnings("unchecked")] then we will get warning because 
	 * we are converting object to generic.
	 */
	
	@SuppressWarnings("unchecked")
	T A[] = (T[]) new Object[10];
	int length = 0; 

	/**
	 * @param v 
	 * It will store the value at index zero initially and then length will be incremented.
	 */

	public void append(T v) {
		A[length++] = v;
	}

	// Display
	/**
	 * This for loop is going to print the value from array A, which is of generic type. So, T is type of generic and 
	 * then it's printing all the values.
	 */
	public void display() {

		for (int i=0; i<length; i++) {
			System.out.println(A[i]);
		}

	}
}

public class Generic {

	public static void main(String[] args) {
		
		MyArray<Integer> ma=new MyArray<>();
		
		ma.append(10);
		ma.append(20);
		ma.append(30);
		
		ma.display();

	}

}
