package com.lambda.demo;

@FunctionalInterface
interface MyLambda {
	public void display();
}

public class LambdaDemo {

	public static void main(String[] args) {

		/**
		 * We don't need of this interface [ new MyLambda() { ] name as for anonymous class
		 *  along with the bracket.
		 *  Remove this method name [ public void display() ] 
		 *  
		 *  () - This is referring to display method only. 
		 *  How it knows that this is display method?
		 *  Because reference is "MyLambda m". So, it's understood that we are overriding the method 
		 *  inside  this "MyLambda" and there is only one method, Therefore there is no chance of confusion
		 *  and that method is not taking an argument that's why the brackets are empty.
		 *  So, this bracket represent display method only.
		 */

		MyLambda m = () -> {
			System.out.println("Hello World");
		};

		m.display();

	}

}
