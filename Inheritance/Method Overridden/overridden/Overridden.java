package com.overridden;

class Super {
	public void display() {
		System.out.println("Super Class Display");
	}
}

class Sub extends Super {
	@Override
	public void display() {
		System.out.println("Sub Class Display");
	}
}

public class Overridden {

	public static void main(String[] args) {
		Super sp = new Super();
		sp.display();

		Sub sb = new Sub();
		sb.display();
//		Super sp = new Sub();
//		sp.display();      // method of object will be call --- DYNAMIC METHOD DISPATCH
	}

}
