package com.comparator.demo;

import java.util.Arrays;



public class ComparatorDemo {

	public static void main(String[] args) {

		/**
		 * The Integer class wraps a value of the primitive type int in an object.
		 *  An object of type Integer contains a single field whose type is int.
		 */

		Integer a[] = { 2, 4, 6, 8, 1, 3, 5, 9 };
        
        Arrays.sort(a,new My());
        
       for(Integer x:a) 
            System.out.println(x);
		
	}

}
