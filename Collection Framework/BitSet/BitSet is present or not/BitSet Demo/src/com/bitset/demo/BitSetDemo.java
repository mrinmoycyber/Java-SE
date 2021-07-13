package com.bitset.demo;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		BitSet bs1 = new BitSet();

		/* Here 1, 3, 5, 7 are false means 0 and 0, 2, 4, 6, 8 are true means 1. */

		bs1.set(0);
		bs1.set(2);
		bs1.set(4);
		bs1.set(6);
		bs1.set(8);

		System.out.println(bs1);
		System.out.println(bs1.get(1));// If we want to show a particular bit. taking bit 1 which is false bercause it was absent.
		System.out.println(bs1.get(2)); // present
		

	}

}
