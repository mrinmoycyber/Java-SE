package com.localInnerClass;

class Outer {
	public void display() {
		class Inner {
			public void show() {
				System.out.println("Hello");
			}
		}
//		Inner i = new Inner();
//		i.show();   //calling the method of inner class
		new Inner().show(); // calling the method of inner class.There is no reference, create an object and also it will call the method. [Anonymous Object] 
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.display(); // creating an object of inner class
	}

}
