package com.lambda.demo;

public class Demo {

	public void meth1() {

		UseLambda ul = new UseLambda();
		ul.callLambda(() -> {

			System.out.println("Hello");

		});
	}

}
