package com.linkedhashset.demo;


import java.util.HashSet;

import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> lhs = new HashSet(10); 

		lhs.add("A");
		lhs.add("C");
		lhs.add("E");
		lhs.add("K");
		lhs.add("B");
		lhs.add("G");

		lhs.forEach(System.out::println); // HashSet- print these values in sorted order
		
//		Iterator<String> it = lhs.iterator();
//
//		while (it.hasNext()) {
//
//			System.out.println(it.hasNext()); // It will give the reference to the element and move to the next element.
//
//		}

	}

}
