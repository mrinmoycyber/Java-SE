package com.NestedInner;

class Outer {
	int x = 10;

	class Inner {
		int y = 20;

		public void innerDisplay() {
			System.out.println(x + " " + y);
		}
	}

	public void outerDisplay() {
		Inner i = new Inner();
		i.innerDisplay();
	}
}

public class NestedInner {

	public static void main(String[] args) {
//		Outer o = new Outer();
//		o.outerDisplay(); // If I call this method[o.outerDsiplay();], the this method will create an
		// object of Inner class. Then it will call i.innerDisplay()

		Outer.Inner oi = new Outer().new Inner(); // We can directly access inner class inside main method but we have
													// to first create an object of outer,Then we can create an object
													// of inner, then we can access it.
		oi.innerDisplay(); // we can directly access object of inner class inside main method.
	}

}
