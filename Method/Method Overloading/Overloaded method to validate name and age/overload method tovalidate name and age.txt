//Overloaded method to validate name and age

package com.mrinu;

public class NameAndAge {
	boolean validate(String name) {
		return name.matches("[a-z A-Z\\s]+");
	}

	boolean validate(int age) {
		return age >= 3 && age <= 15;
	}

	public static void main(String[] args) {
		NameAndAge a = new NameAndAge();
		System.out.println(a.validate("Mrinmoy"));
		System.out.println(a.validate(23));

	}

}
