package com.lambda.demo;

@FunctionalInterface
interface MyLambda {
	public void display(String stgr);
}

public class LambdaDemo {

	public static void main(String[] args) {

		MyLambda m = (s) -> {
			System.out.println(s);
		};

		m.display("Java");

	}

}
