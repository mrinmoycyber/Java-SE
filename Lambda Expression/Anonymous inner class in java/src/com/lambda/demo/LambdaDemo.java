package com.lambda.demo;

@FunctionalInterface
interface MyLambda {
	public void display();
}

public class LambdaDemo {

	public static void main(String[] args) {

		/** Here I am creating an object of interface MyLambda and 
		 * I am overriding method of that interface. So, its nothing but a anonymous inner class.
		 */
		
		MyLambda m = new MyLambda() {
			public void display() {
				System.out.println("Hello World");
			}
		};

		m.display();

	}

}
