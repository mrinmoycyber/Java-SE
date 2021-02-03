package com.mrinu;

public class Swap {

	public static void main(String[] args) {
		int a = 5; // 101
		int b = 4; // 100
		// ^ -> XOR 1 1 -> 0     1 0 -> 1     0 0 -> 0    0 1 -> 1
		a = a ^ b; // 1 0 1 XOR 1 0 0 -----------> 0 0 1 
		b = a ^ b; // 1 0 0 XOR 0 0 1 -----------> 1 0 1  ----> 5
		a = a ^ b; // 0 0 1 XOR 1 0 1 -----------> 1 0 0  ----> 4
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	
		
	
	    int c = 5; // 4 bytes
	    int d =4;  // 4 byes
	    int temp;    
	    
	    /*here we are using  4 + 4 = 8 bytes but unfortunately we are creating one more variable (temp) just for swapping that
	     means we are wasting extra memory */
	   temp = c; // temp = 5 
	   c = d; // c = 4
	   d = temp; // d = 5
	   
	   System.out.println("c : " + c);
	   System.out.println("d : " + d);
	
	
		int e = 5;  // 101
		int f = 4;  // 100
		/* Here we can see that we are not wasting extra any variable but its not sufficient.. 
		 Why? as we can see we are using three bits for variable e and variable f but in operation the value of e becomes
		 9 which  comes out to be the binary format of nine is  1 0 0 1. That means in the course of operation your result will 
		 go from 3 bits to 4 bits. So that's why we are using XOR operation */
		e = e + f; // 5 + 4 = 9
		f = e - f; // 9 - 4 = 5
		e = e - f; // 9 - 5 = 4
		
		System.out.println("e : " + e);
		System.out.println("f : " + f);
	}
}
