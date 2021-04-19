package com.string;

public class StringBufferBuilder {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		StringBuilder s3 = new StringBuilder("Hello");

		s1.concat(" World");
		s2.append(" world");
		s3.append(" world");

		System.out.println(s1); /*
								 * It will show hello because first String will not modify though it has
								 * concatenate, but it has given a new string
								 */
		System.out.println(s2);
		System.out.println(s3);

	}

}
