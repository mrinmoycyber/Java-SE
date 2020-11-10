package conditionalOperators;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter first number");
		a = obj.nextInt();
		System.out.println("Enter second number");
		b = obj.nextInt();
		c = (a > b) ? a : b;
		System.out.println("Greater value is"  +c);
	}

}
