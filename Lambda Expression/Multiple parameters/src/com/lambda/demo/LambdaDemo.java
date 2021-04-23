package com.lambda.demo;

@FunctionalInterface
interface MyLambda {
	public int add (int x, int y);
}

public class LambdaDemo {

	public static void main(String[] args) {

		/**
		 *We don't have to say return automatically it will be return, 
		 *so even if we don't have to us the keyword return
		 *x+y are added and obviously it has to be return because the return type is integer.
		 *Remember x+y is nothing but an expression.So that's why the name comes LAMBDA EXPRESSION.
		 *We can write on expressions just expressions like methods.   	  
		 */
		
		MyLambda m = (x,y)->x+y;
		
		int r = m.add(20, 30);
		System.out.println(r);

	

	}

}
