package com.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import jdk.swing.interop.SwingInterOpUtils;

public class ListDemo {

	public static void main(String[] args) {

		// Create an ArrayList
		ArrayList<Integer> al1 = new ArrayList<>(20); // It will allow only integer data type
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

		al1.add(10); // 10 will be store in ArrayList
		al1.add(0, 5); // 5 will be inserted before 10
		// al1.addAll(al2); // In first list I will add all elements of second list
		al1.addAll(1, al2); // In first list I will add all elements of second list but in index 1
		al1.add(5, 70); // At index 5 it will add 70
		al1.set(6, 100); // Change the element at index 6

		/**
		 * Inside this method we can mention lambda expression. n will be a parameter,
		 * so every element will become an n. Then we will print the values. Here
		 * forEach will automatically scan through all the elements for an ArrayList
		 */

//		al1.forEach(n -> System.out.println(n));

		/**
		 * Scope resolution System.out is a reference and then println as a method
		 * actually it becomes an expression. So, forEach loop utilize this println of
		 * System.out
		 */

//		al1.forEach(System.out::println);

		al1.forEach(n -> show(n)); // If a number is greater than 60, it will print the values

	}

	// Outside main method, it will have to static then it will call
	static void show(int n) {
		if (n > 60) // If a number is greater than 60, it will print the values
			System.out.println(n); /*
									 * why 70 is printing two times? because ArrayList will allow duplicate values
									 */
	}

}
