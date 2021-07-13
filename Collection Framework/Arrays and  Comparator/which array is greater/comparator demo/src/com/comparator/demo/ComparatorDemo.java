package com.comparator.demo;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 8, 1, 3, 5, 9 };
		int b[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

		System.out.println(Arrays.compare(a, b)); // it will compare elemnet by element. If we get -1 it means array b is greater
		                                          // if we get 1 it means array a is greater.

	}

}
