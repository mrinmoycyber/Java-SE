package com.StaticInnerClass;

class Outer {
	int x = 10; // non static
	static int y = 20;

	static class My {
		public void show() {
			System.out.println(y);
			// System.out.println(x); --> ERROR... WHY?? Inside a static class we cannot access non static member of a class. We can access only static member of a class.
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		Outer.My m = new Outer.My();   // Inner class object is created.
		m.show();

	}

}
