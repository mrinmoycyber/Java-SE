package com.lambda.demo;

public class MyLambdaDemo {
	
	/**
	 * I have written a static method reverse  which will take a String
	 * @param str
	 */

	public static void reverse(String str) {

		/**
		 * Creating an object of StringBuffer to reverse a String
		 */
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

	}

}
