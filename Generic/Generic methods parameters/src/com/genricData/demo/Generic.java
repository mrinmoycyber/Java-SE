package com.genricData.demo;

interface A {
}

class B implements A {
}

class C implements A {
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

	// Generic Method
	static <E> void show(E[] list) // In method, just before return type we have to define it.Then we can use it as
									// a parameter as well as
									// inside this method. E-> set of elements.
	{
		// Display all the elements
		for (E x : list) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {

		show(new String[] { "Hi", "Hello", "ola" });
		show(new Integer[] { 10, 20, 30 });

	}

}
