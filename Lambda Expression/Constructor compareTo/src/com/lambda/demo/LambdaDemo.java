package com.lambda.demo;

/**
 * It will call String str1 compare to String str2 it's taking only one
 * parameter but first object it will take it as a reference. So internally it
 * will call like this str1.compareto str2. So we are passing two Strings here.
 */

interface MyLambda {
	public int display(String str1, String str2);
}

public class LambdaDemo {

	public LambdaDemo(String s) {

		System.out.println(s.toUpperCase());

	}

	public static void main(String[] args) {

		MyLambda ml = String::compareTo;

		System.out.println(ml.display("Hello", "Hello"));

		// Due to the difference between there ASCII code the result will be 32, -47, 50
		System.out.println(ml.display("hello", "Hello"));
		System.out.println(ml.display("Hello", "wello"));
		System.out.println(ml.display("zello", "Hello"));

	}

}
