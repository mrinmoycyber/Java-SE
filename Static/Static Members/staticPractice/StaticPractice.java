package com.staticPractice;

class Test {
	static int x = 10;   //static members have single copy.. It will share by both the objects. ( t1 & t2)
	int y = 20;

	void show() {
		System.out.println(x + " " + y);  //static int x is accessible
	}

	static void display() {      //static int x is accessible... static method can't access  non static member.(int y=20) 
		System.out.println(x);
	}
}

public class StaticPractice {

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.show();
		t1.x = 30;
		t1.y = 50;

		Test t2 = new Test();
		t2.show();
	}

}
