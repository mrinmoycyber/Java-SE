package com.genricData.demo;

class A {
}

class B extends A {
}

class C extends A {
}

/**
 * // If we don't use this [@SuppressWarnings("unchecked")] then we will get
 * warning because we are converting object to generic.
 */

@SuppressWarnings("unchecked")
class MyArray<T> {
	T A[] = (T[]) new Object[10];
	int length = 0;

	/**
	 * @param v It will store the value at index zero initially and then length will
	 *          be incremented.
	 */

	public void append(T v) {
		A[length++] = v;
	}

	// Display
	/**
	 * This for loop is going to print the value from array A, which is of generic
	 * type. So, T is type of generic and then it's printing all the values.
	 */
	public void display() {

		for (int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}

	}
}

public class Generic {

	static void fun(MyArray<? super B> obj) {  // we can only use super in here 
		obj.display();

	}

	public static void main(String[] args) {

		MyArray<B> ma1 = new MyArray<>();
		System.out.println("SUPER IS WORKING B");

		MyArray<A> ma2 = new MyArray<>();
		System.out.println("SUPER IS WORKING A");
		
		fun(ma1);
		fun(ma2);

	}

}
