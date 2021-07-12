package com.hashtable.demo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); /*converted into generic class 
		                                                                  and this class is implementing map interface*/

		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");

		String s = (String) ht.get(3); 

		Enumeration e = ht.elements();  // For values
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
           }                                              
		
		System.out.println("----------------------------------");
		
		Enumeration f = ht.keys();  // For keys
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
           } 

//		System.out.println(ht);

	}

}
