package com.mrinmoy;

public class BranchingStatements {

	public static void main(String[] args) {
		int switchValue = 5;
		switch (switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Valu was 2");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("was a 3, or a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;
		default:
			System.out.println("value not 1 or 2");
		}

	}

}
