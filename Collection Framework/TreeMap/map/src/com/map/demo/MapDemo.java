package com.map.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "Kolkata", 1, "Mumbai", 2, "Pune", 3, "Delhi"));
		// Key - is an integer and String - is a value

		tm.put(4, "Bengaluru");
		tm.put(5, "Gurgaon");

		/**
		 * This method will give us the first entry and we are taking it as a reference
		 * of type entry(e). Then from e, we are getting it's key as well as value.
		 */

		Entry<Integer, String> e = tm.firstEntry();
		System.out.println(e.getKey() + " " + e.getValue());

		System.out.println(
				tm.ceilingEntry(5).getValue()); /*
												 * Celling- If the same value is present in here, then it will show
												 * that, otherwise the next nearest value will print.
												 */
		System.out.println(tm.get(4)); // Bengaluru
		System.out.println(tm);

//		for (int i = 0; i < tm.size(); i++)
//			System.out.println(tm.get(i));

	}

}
