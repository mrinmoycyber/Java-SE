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

	static void fun(MyArray<?> obj) {    // wildcard <?> - It means any type. 
		obj.display();

	}

	public static void main(String[] args) {

		MyArray<String> ma1 = new MyArray<>();
		ma1.append("Hi");
		ma1.append("Good Morning");

		MyArray<Integer> ma2 = new MyArray<>();
		ma2.append(10);
		ma2.append(20);

		fun(ma1);
		fun(ma2);

	}

}
