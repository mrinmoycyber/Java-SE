package com.hashtable.demo;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable(); // It will take both the key and value as objects

		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");

		String s = (String) ht.get(3); /*
										 * Hash table is taking everything as an object, so it will returning as object
										 * and object cannot assign to a string. I have to typecast it like a string.
										 */

		Enumeration e = ht.elements();  // For values
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
           }                                              /*
			                                               * remember it's not a generic class, so there's no iterator available for this
			                                               * class but there is a class called enumeration. It will iterate through all
			                                               * these elements/
			                                               */
		
		System.out.println("/*----------------------------------*/");
		
		Enumeration f = ht.keys();  // For keys
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
           } 

//		System.out.println(ht);

	}

}
