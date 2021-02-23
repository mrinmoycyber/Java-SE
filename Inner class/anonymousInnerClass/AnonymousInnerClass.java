package com.anonymousInnerClass;

abstract class My {
	abstract public void show();
}

class Outer {
	public void display() {
		My m = new My() {
			public void show() {
				System.out.println("Hello");
			}
		};
		m.show(); // calling show method

//		new My() {
//			public void show() {
//				System.out.println("Hello");
//			}
//		}.show();   // this is an anonymous object as well as the anonymous class...i.e inheriting from class My and also calling a method show.
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.display(); // calling display method

	}

}
