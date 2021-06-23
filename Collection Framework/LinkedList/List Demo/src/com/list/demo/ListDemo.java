package com.list.demo;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		// Create an LinkedList
		LinkedList<Integer> al1 = new LinkedList<>(); // It will allow only integer data type
		LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

		al1.add(10); // 10 will be store in ArrayList
		al1.add(0, 5); // 5 will be inserted before 10
		// al1.addAll(al2); // In first list I will add all elements of second list
		al1.addAll(1, al2); // In first list I will add all elements of second list but in index 1
		al1.add(5, 70); // At index 5 it will add 70
		al1.set(6, 100); // Change the element at index 6
		al1.addFirst(3); // Add an element at first
		al1.addLast(200); // // Add an element at last

		al1.forEach(n -> show(n)); // TRAVERSE 

	}

	// Outside main method, it will have to static then it will call
	static void show(int n) {
//		if (n > 60) // If a number is greater than 60, it will print the values
			System.out.println(n); /*
									 * why 70 is printing two times? because ArrayList will allow duplicate values
									 */
	}

}
