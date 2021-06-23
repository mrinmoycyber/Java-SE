package com.set.demo;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(20, 0.75f); /* Initial size of the Hash table 20 and loading factor 0.75 
		                                                  then only 25% blank spaces in there*/

		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);

		System.out.println(hs); // o/p 20, 10, 30 because 10 will not duplicated
		
//		hs.forEach(n -> System.out.println(n));
		
		/* Only use HashSet if you want add or remove operations in constant time. Here 25% of storage is wasted but 
		because of this we can add or remove in constant time*/
		

	}

}
