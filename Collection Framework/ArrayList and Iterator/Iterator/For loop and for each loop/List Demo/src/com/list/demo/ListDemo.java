package com.list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

//		for (int i = 0; i < al1.size(); i++)
//			System.out.println(al1.get(i)); /*
//											 * I have to get an element, I cannot use subscript operator over this it's
//											 * not allowed. It's not an array it's an ArrayList, it's a generic object
//											 * it's an object of generic class
//											 */
		for (Integer x : al1)
			System.out.println(x);



	}

}
