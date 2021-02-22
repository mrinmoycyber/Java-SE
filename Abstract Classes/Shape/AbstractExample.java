package com.AbstractExample;

abstract class Shape {
	abstract public double area();

	abstract public double perimeter();
}

class Circle extends Shape {
	double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends Shape {
	double length;
	double breadth;

	public double area() {
		return length * breadth;
	}

	public double perimeter() {
		return 2 * (length + breadth);
	}
}

public class AbstractExample {

	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		r.length = 15;
//		r.breadth = 7;
//		System.out.println(r.area());
//		System.out.println(r.perimeter());
//
//		Shape s = r;
//		System.out.println(s.area());
//		System.out.println(s.perimeter());

		Circle c = new Circle();
		c.radius = 3;
		System.out.println(c.area());
		System.out.println(c.perimeter());

		Shape sh = c;
		System.out.println(sh.area());
		System.out.println(sh.perimeter());

	}

}
