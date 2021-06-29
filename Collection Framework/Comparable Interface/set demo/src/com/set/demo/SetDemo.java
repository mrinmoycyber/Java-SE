package com.set.demo;

import java.util.List;
import java.util.TreeSet;

/**
 * Remember TreeSet is a sorted set. So for sorting, we should arrange the
 * elements in increasing order. So, Based on x & y coordinates, we can check
 * which point is smaller and greater. But Java or TreeSet doesn't know about
 * it. So I should define here, which one is smaller and which one is greater.
 * Then only TreeSet can sorted based on that condition. So I have to define how
 * to compare two points. And remember whenever we are using any class here in
 * TreeSet then that class must implement comparable.
 */

class Point implements Comparable {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String toString() {
		return "x=" + x + " y=" + y;
	}

	public int compareTo(Object o) { /*
										 * When we say implements interface, We have to override the method i.e
										 * compareTo and remember parameter type should be an object because this is the
										 * signature of the method is present in comparable
										 */
		Point p = (Point) o;
		if (this.x < p.x)
			return -1;
		else if (this.x > p.x)
			return 1;
		else {
			if (this.y < p.y)
				return -1;
			else if (this.y > p.y)
				return 1;
			else
				return 0;
		}
	}

}

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Point> ts = new TreeSet<>(); 
		
		/**
		 * For printing these objects I should have a toTring method
		 */

		ts.add(new Point(1, 1)); // I should write a constructor because here I'm not taking any reference and
									// creating an anonymous object.
		ts.add(new Point(5, 5));
		ts.add(new Point(5, 1));

//		ts.forEach(n -> System.out.println(n));

		System.out.println(ts);

	}

}
