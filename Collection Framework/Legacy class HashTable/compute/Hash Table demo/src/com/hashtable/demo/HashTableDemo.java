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

		ht.compute(2, (k,v)->v+"Z"); // change the value of 2 
		ht.computeIfAbsent(7, (k)->"Y"+k); // Here key 7 is not present so it will insert this key and the value will be Y. 
        

     	System.out.println(ht);

	}

}
