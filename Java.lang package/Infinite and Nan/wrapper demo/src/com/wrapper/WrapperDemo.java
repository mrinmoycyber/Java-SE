package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

//		float a = 12.5f;
//		Float b = 12.5f / 0; // o/p -> infinite
//
//		System.out.println(b.isInfinite());
//		System.out.println(b == Float.POSITIVE_INFINITY);

		// Check for negative infinity
//		Float c = -12.5f / 0;
//		System.out.println(c == Float.NEGATIVE_INFINITY);

		// Not a Number -> NAN
		Float d = (float) Math.sqrt(-1); // imaginary number... sqrt method returns double value.
											// So I have to typecast it
		System.out.println(d.isNaN());  // o/p -> true, because its not a number.
        
		Float e = (float) Math.sqrt(9); 
		                                
        System.out.println(e.isNaN());  // o/p -> false because sqr root of 9 is 3
        
	}

}
