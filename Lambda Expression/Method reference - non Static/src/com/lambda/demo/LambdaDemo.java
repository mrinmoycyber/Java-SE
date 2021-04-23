package com.lambda.demo;

interface MyLambda {
	public void display(String str);
}

public class LambdaDemo {

	public static void main(String[] args) {

		/**
		 * Assign a method reference by taking an object 
		 * For non static member we have to take an object and assign them.
		 * 
		 */

		MyLambdaDemo ld = new MyLambdaDemo();
		MyLambda ml = ld::reverse;
		
		ml.display("Hello");

	}

}
