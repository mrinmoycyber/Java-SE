package com.linkedhashset.demo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) { /*
								             * maintain order of insertion , LinkedHashMap does a mapping of keys to values,
								             * a LinkedHashSet simply stores a collection of things with no duplicates.
								             */

	   LinkedHashSet<String> lhs=new LinkedHashSet(10); 
	   
	   lhs.add("A");  // If we are using HashSet here it will print these values in sorted order 
	   lhs.add("C");
	   lhs.add("E");
	   lhs.add("K");
	   lhs.add("B");
	   lhs.add("G");
	   
	   lhs.forEach(System.out::println); /* method reference - passing a method as a parameter, where we get this method (println)? 
	                                      belong to System.out
	                                      Here it will call println and then it will print all elements*/
	   
		
	}

}
