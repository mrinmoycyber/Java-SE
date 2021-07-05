package com.linkedhashmap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true) {
			protected boolean removeEldestEntry(Map.Entry e) {   // Utilize this for fixed size of five as a cache memory.
				return size() > 5;
			}
		};

		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");

		String s = lhm.get(2);
		s = lhm.get(1);
		s = lhm.get(3);
		lhm.put(6, "F");

		lhm.forEach((k, v) -> System.out
				.println(k + " " + v)); /*
										 * Here in output 4 is gone because 4 was on the top and it was not recently
										 * use. So, when I am inserting 6 I am exceeding the capacity five. So 4 is
										 * removed because it was least recently used.
										 */

	}

}
