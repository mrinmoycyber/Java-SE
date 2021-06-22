package com.list.demo;

import java.util.ArrayList;
import java.util.List;

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

		// I want to know that it contains value 60 or not and it will return true or false
		System.out.println(al1.contains(60));

		// It will help us to find the element at index
		System.out.println(al1.get(5));
		
		//I want find the element index
		System.out.println(al1.indexOf(60));
		
		// Element index
		System.out.println(al1.lastIndexOf(50));

		System.out.println(al1);

	}

}
