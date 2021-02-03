package com.switchwebsite;

import java.util.*;

public class SwitchWebsite {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Domain Name");
		String domain = scan.nextLine();
		String ext = domain.substring(domain.lastIndexOf(".") + 1);
		switch (ext) {
		case "com":
			System.out.println("Commercial");
			break;
		case "org":
			System.out.println("Organisation");
			break;
		case "net":
			System.out.println("Network");
			break;
		case "govt":
			System.out.println("Goverment");
			break;
		case "in":
			System.out.println("India");
			break;
		}
	}

}
