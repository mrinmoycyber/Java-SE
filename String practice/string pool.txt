package com.string.pool;

public class StringPool {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		System.out.println(str1 == str2); // true- It means they are holding the same object.

		String str3 = "Boy";
		String str4 = "boy";
		System.out.println(str3 == str4); /*
											 * false- because these two strings are not same.Java cannot maintain a
											 * single copy of it. So that's why java maintains two different objects.
											 */

		String str5 = "Girl";
		String str6 = new String("Girl");
		System.out.println(str5==str6); /*
										 * false- this will be referring to new object in pool for this [new String] new
										 * object will be created in heap.So they will be not referring to same object
										 */

	}

}
