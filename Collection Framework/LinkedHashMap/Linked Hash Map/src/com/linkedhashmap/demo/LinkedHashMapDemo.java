package com.linkedhashmap.demo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true);
		/*
		 * Initial size is 5, If we want to change the order of access then mentioned
		 * here true. So now the key will show the order of access.
		 */

		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");
		lhm.put(9, "H");
		lhm.put(7, "G");

		String s = lhm.get(7); // When I am accessing the keys order will not change
		s = lhm.get(9);
		s = lhm.get(1);

		lhm.forEach((k, v) -> System.out
				.println(k + " " + v)); /*
										 * k - key, v - value, It will shown first which is least recently access and
										 * the most recently access is 1. So this is shown in the order of their access.
										 * So here a constructor will define which type of order we want, so in this
										 * constructor we also mention loading factor.
										 */

	}

}
