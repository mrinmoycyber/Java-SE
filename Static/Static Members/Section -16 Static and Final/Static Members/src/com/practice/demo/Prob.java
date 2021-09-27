
package com.practice.demo;

class Test {
	static int x = 10;
	int y = 20;

	// Non static member can access static member of a class
	void show() {
		System.out.println(x + " " + y); // non static member [y]
	}

	static void display() {
		System.out.println(x); // non static member cannot access static method
	}

}

public class Prob {

	public static void main(String args[]) {

		// both these members wil show 10 & 20 - static member will just have a single copy [static int x = 10; int y = 20;]
		// it will shared by both the object.
//		Test t1 = new Test();  
//		t1.show();
//
//		Test t2 = new Test();
//		t2.show();

		Test t1 = new Test();
		t1.show(); // x= 10 y = 20
		t1.x = 30;
		t1.y = 50;

		Test t2 = new Test();
		t2.show(); // x= 30 same data member [static] y = 20 not change to 50 because not a same data member.

	}

}
