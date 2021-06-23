package com.priority.demo;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * When the smaller value is higher priority means it's a min heap. If we want
 * to change the order or make it as max heap. So that the larger element having
 * higher priority then we can define a comparator.
 */

class MyCom implements Comparator<Integer> { // When I implementing comparator I should override this method
	public int compare(Integer o1, Integer o2) {

		/**
		 * If value of first integer(o1) is smaller than value of second integer(o2),
		 * for smaller no. we should return -1 But here we return +1. And if value of
		 * second integer is smaller that value of first integer, we should return +1.
		 * But here we return -1. Or else we should return zero, when they are equal.
		 * So, now my comparator is different larger value is higher priority.  
		 */

		if (o1 < o2)
			return 1;
		if (o2 < o1)
			return -1;
		return 0;

	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom()); // Now when I peek the first value I will get the larger value

		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);

		// Display the head elements
		System.out.println(pq.peek());

		// Delete an element
		pq.poll(); // element 3 is deleted //When larger value is higher priority then 30 will be deleted 
		System.out.println("after deletion");

		// Traverse (display all the elements)
		pq.forEach((x) -> System.out.println(x));

	}

}
