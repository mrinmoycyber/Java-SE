package com.lambda.demo;

@FunctionalInterface
interface MyLambda {
	public void display();
}

class My implements MyLambda {

	public void display() {
		
		System.out.println("Hello World");
		
	}
	
}

/**
 * Instead of taking a reference of class My. I can change it into a reference of MyLambda, it works because 
 * MyLambda is implemented class My. So object of class My can also have a reference of MyLambda.
 */

public class LambdaDemo {

	public static void main(String[] args) {

		MyLambda m = new My();
		m.display();

	}

}
