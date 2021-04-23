package com.lambda.demo;

interface MyLambda {
	public void display(String str);
}

public class LambdaDemo {

	public static void main(String[] args) {

		/**
		 * Here this println will be assign to display method. So this display method
		 * will act like println method. So when this is acting like println means
		 * whatever the String I pass, it will print.So this method becoms a println
		 * method.
		 */
		
		MyLambda ml = System.out::println;
		ml.display("Hello");

	}

}
