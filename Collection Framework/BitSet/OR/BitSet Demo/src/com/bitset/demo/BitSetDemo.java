package com.bitset.demo;

import java.util.BitSet;

public class BitSetDemo {

	public static void main(String[] args) {
		BitSet bs1 = new BitSet();

		bs1.set(0);
		bs1.set(2);
		bs1.set(4);
		bs1.set(6);
		bs1.set(8);
		
		BitSet bs2=new BitSet();
		//bs2.set(0);
		bs2.set(1);
		//bs2.set(2);
		bs2.set(3);
		//bs2.set(4);
		bs2.set(5);
  	    //bs2.set(6);
		bs2.set(7);
		//bs2.set(8);
		
	    // Or - If anyone bit is true it's true.  [0-> false, 1->true]
		bs1.or(bs2);  // it will print 0, 1, 2, 3, 4, 5, 6, 7, 8 because and operation 1->1 =1, 0->1=1, 1->0=1, 0->0=0
		
		

		System.out.println(bs1);
	

	}

}
