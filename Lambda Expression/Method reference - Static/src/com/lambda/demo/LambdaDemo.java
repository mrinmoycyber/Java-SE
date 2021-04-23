package com.lambda.demo;

interface MyLambda {
	public void display(String str);
}

public class LambdaDemo {

	public static void main(String[] args) {

		/**
		 * For reference we use this scope resolution like operator and the method name is reverse
		 */

		MyLambda ml = MyLambdaDemo::reverse;
		
		// Here display become reverse 
		ml.display("Hello");

	}

}
