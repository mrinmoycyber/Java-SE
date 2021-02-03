package com.mrinu;

public class ExampleMethodOverloading {
	public int max(int a, int b) {
		return a > b ? a : b; // If a is greater than b. Then return a or return b.
	}

	public int max(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > c)
			return b;
		else
		return c;
	}

	public static void main(String[] args) {
		ExampleMethodOverloading m = new ExampleMethodOverloading();
		System.out.println(m.max(10, 15));
		System.out.println(m.max(12, 15, 18));
	}

}
