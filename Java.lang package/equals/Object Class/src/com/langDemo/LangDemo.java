package com.langDemo;

public class LangDemo {

	public static void main(String[] args) {

		Object o1 = new Object();
		Object o2 = new Object();
		// o/p will be false because o1 & o2 are different objects

//		 Object o2 = o1;
		// it will return true because the reference are holding the same object.
		System.out.println(o1.equals(o2));

		System.out.println(o1.equals(o1));
		// it will always true because holding same object.

	}

}
