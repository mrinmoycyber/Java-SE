package com.ThrowThrows;

public class ThrowThrows {

	static int area(int l, int b) throws Exception {
		if (l < 0 || b < 0) {
			throw new Exception();
		}
		return l * b;
	}

	static void meth1() throws Exception {
		System.out.println(area(-10, 5));
	}

	public static void main(String[] args) {
		try {     //Here I handle this EXCEPTION or if we want to, it can handle by JVM also... Just after p.s.v main write  throws Exception and deletes try and catch block
			meth1();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}