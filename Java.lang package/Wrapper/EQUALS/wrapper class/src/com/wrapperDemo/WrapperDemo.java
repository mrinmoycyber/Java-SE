package com.wrapperDemo;

public class WrapperDemo {

	public static void main(String[] args) {

		int m1 = 15;
		Integer m2 = m1;
		Integer m3 = 15;
		System.out.println(m2.equals(m3));

		/*
		 * m2 & m3 both are objects. So just like we know in object class it was
		 * checking whether the object are same. References are holding the same object
		 * but here it will CHECK FOR THE VALUE
		 */

	}

}
