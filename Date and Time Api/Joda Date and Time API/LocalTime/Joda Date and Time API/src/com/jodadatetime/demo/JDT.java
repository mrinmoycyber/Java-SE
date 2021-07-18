package com.jodadatetime.demo;

import java.time.LocalTime;

public class JDT {

	public static void main(String[] args) {

		LocalTime t = LocalTime.now(); // if we print t now we will get current time.
		System.out.println(t);
		
		/**
		 * This time will not modified, we have to take separate objects, take t1
		 * Remember this is immutable. 
		 */
		LocalTime t1 = t.minusHours(3); // Subtract three hours

		System.out.println(t1);

	}

}
