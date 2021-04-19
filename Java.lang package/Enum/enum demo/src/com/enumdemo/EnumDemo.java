package com.enumdemo;

enum Dept {

	CS, IT, ECE, EE

}

public class EnumDemo {

	public static void main(String[] args) {

//		Dept list[] = Dept.values();
//
//		for (Dept x : list) {
//
//			System.out.println(x);

//		}

		Dept d = Dept.ECE;

		switch (d) {

		case CS:
			System.out.println("Head: John \nBlock: A");
			break;
		case IT:
			System.out.println("Head: Smith \nBlock: B");
			break;
		case ECE:
			System.out.println("Head: Srinivas \nBlock: C");
			break;
		case EE:
			System.out.println("Head: Lalit \nBlock: D");
			break;

		}

	}

}
