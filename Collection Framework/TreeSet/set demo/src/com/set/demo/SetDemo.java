package com.set.demo;

import java.util.List;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10,
				40)); /*
						 * it will not take duplicate values and it will automatically sorted it
						 */

		ts.add(25);

		System.out.println(
				ts.ceiling(35)); /*
									 * It will give any number that is greater than or equal to a given number. So,
									 * If i give 40, It will give us 40 only because we are having a same number.
									 * But If I am giving a number which is not present in there, Then it will give
									 * us the nearest number. Example- If I give 35 It will give me 40 from the
									 * list, it will give us the next nearest number but it should be greater.
									 */

		System.out.println(
				ts.contains(20)); /*
									 * It will search that element is present in there or not, return true or false
									 */

		System.out.println(ts.floor(35)); /*
											 * It will give any number that is smaller than or equal to a given number.
											 * So, if I give 35, it will give us 30 because it will give us the nearest
											 * smaller number than 35, 35 is not present in the list
											 */

//		ts.forEach(n -> System.out.println(n));

		System.out.println(ts);

	}

}
