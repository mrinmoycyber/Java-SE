package com.mrinu;

public class ExampleVariableArguments {
	/*
	 * static void show(int... A) { for (int x : A) { System.out.println(x); } }
	 * 
	 * public static void main(String[] args) { show(); show(20, 30, 40); show(new
	 * int[]{3,5,7,9,11}); // this is an anonymous array which does not have any
	 * reference.
	 * 
	 * }
	 */
	static void showList(int start, String... S) {
		for (int i = 0; i < S.length; i++) {
			System.out.println(start + ". " +S[i]);
			start++;
		}
	}

	public static void main(String args[]) {
		showList(5, "John", "Ram", "Sham");
	}
}
