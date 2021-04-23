package com.lambda.demo;

interface MyLambda {
	public void display(String str);
}

public class LambdaDemo {

	/**
	 * I have written a constructor for this LambdaDemo class which take a String as
	 * parameter and it will print the upper case of a String.
	 * @param s
	 */
	
	public LambdaDemo(String s) {

		System.out.println(s.toUpperCase());

	}

	public static void main(String[] args) {

		/**
		 * When we call display method the this constructor [ public LambdaDemo (String
		 * s) ] will be call and it's printing to upper case. So it will print upper
		 * case of this hello.
		 */

		MyLambda ml = LambdaDemo::new;

		ml.display("Hello");

	}

}
