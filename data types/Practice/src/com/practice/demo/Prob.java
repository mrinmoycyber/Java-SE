// Check Binary Bits of an Integer

package com.practice.demo;

public class Prob {

	public static void main(String args[]) {
		int x = 5;
		int y = -5; // -5 will store in 2's complement

		System.out.println(Integer.toBinaryString(y));  
		System.out.println(Integer.toBinaryString(x));
//		System.out.println(Integer.toHexString(x));
//		System.out.println(Integer.toOctalString(x));

	}

}
