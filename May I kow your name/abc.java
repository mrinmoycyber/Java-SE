package com.drive.client;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {

		String name;

		Scanner sc = new Scanner(System.in);
		System.out.println("May I know your Name: ");
		name = sc.nextLine();

		System.out.println("Welcome " + name);

	}
}