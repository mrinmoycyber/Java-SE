package com.drive.client;

public class ClientMain {

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
		String month = "NoVeMber";
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
		String month1 = "deCEMber";
		switch (month1.toUpperCase()) {
		case "FEBRUARY":
			System.out.println("feb");
			break;
		case "DECEMBER":
			System.out.println("too cold");
			break;
		default:
			System.out.println("Not Sure");
		}

	}

}
