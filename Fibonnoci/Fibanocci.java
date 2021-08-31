// Section-8, Video-76

/**
  0, 1, 1, 2, 3, 5, 8, 13, 21
  Every next term is  obtained by adding previous two terms.
  ex- 0+1 = 1, 1+1=2... 
  Mathematically- fib(n) = fib(n-2) + f(n-1) 
*/

package com.mrinu;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program to Fibannoci Series");
		System.out.println("Enter number of Terms"); // Let us say 10
		
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		
		/** Here we are printing 0th term and 1st term. So total n-2 terms we have to print using loop 
		because Oth term and 1st term we'r printing. Rest of the term we have to print. So, everytime we get a new term by adding previous two numbers.*/
		System.out.print(a + "," + b + ","); 
		
		// Remember everytime we have to add two terms and get the next term. So, this should be in a loop.
		for (int i = 0; i < n - 2; i++) {
			
			// Obtain c by adding a + b. So we will get the next term in c. 
			c = a + b;
			System.out.print(c +",");
			
			/**Remember we have to change value of a, b & c. So b value I should put it in a and c value should put it in b. So, after adding and 
			getting a new term.*/
			
			// We have to copy the value b in a. i.e. previous two terms. We have to shift them.
			a = b; 
			// New term should be store in b. c should be store in b. 
			b = c;
		}

	}
}
