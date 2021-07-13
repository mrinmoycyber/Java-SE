package com.comparator.demo;

import java.util.Comparator;

/**
 * I have implemented compare method inside comparator interface by reversing the order.
 */

class My implements Comparator<Integer>
{

	    public int compare(Integer i1,Integer i2)
	    {
	    	/**
	    	 *i1<i2 comparison value will be -1 but here we will return 1. [REVERSING]
	    	 *i1>i2 comparison value will be 1 but here we will return -1. So it will be reversing the order.  
	    	 *Here if the number is smaller actually it's greater.
	    	 */
	    	
	        if(i1<i2)
	            return 1;
	        if(i1>i2)
	            return -1;
	        return 0;
	    }
	}

