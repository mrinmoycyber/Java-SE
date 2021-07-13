package com.comparator.demo;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 8, 1, 3, 5, 9 };
		int b[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

//		int c[] = Arrays.copyOf(a, 4); // taking copy of 4 elements from a.
		int c[] = Arrays.copyOf(a, a.length); // copy all the elements from a
//		Arrays.parallelSort(c);
		Arrays.sort(c);

		for (int x : c)
			System.out.println(x);

	}

}
