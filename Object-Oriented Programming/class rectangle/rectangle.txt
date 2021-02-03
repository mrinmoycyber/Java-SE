package com.mrinu;

public class Rectangle {
	public double length;
	public double breadth;

	public double area() {
		return length * breadth;
	}

	public double perimeter() {
		return 2 * (length + breadth);
	}

	public boolean isSquare() {
		// return length==breadth;
		if (length == breadth) // When we us equal to sign the answer will be true or false.
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.length = 10.5;
		r.breadth = 10.5;
		System.out.println("Area: " + r.area());
		System.out.println("Perimeter: " + r.perimeter());
		System.out.println("Is it Square: " + r.isSquare());
	}

}
