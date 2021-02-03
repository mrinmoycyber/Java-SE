package com.mrinmoy;

public class BranchingChallenge {

	public static void main(String[] args) {
		char charValue = 'D';
		switch (charValue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
		case 'D':
		case 'E':
			System.out.println(charValue + " was found");
			break;
		default:
			System.out.println("Not found");

		}
		String month = "June";
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "november":
			System.out.println("Birthday boy");
			break;
		default:
			System.out.println("Not Sure");
		}

	}

}
