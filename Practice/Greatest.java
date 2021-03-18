//Take two int values from user and print greatest among them.

package checking;

import java.util.Scanner;

public class Greatest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Please enter the Second Number");
		int num2 = sc.nextInt();
		if (num1 > num2)
			System.out.println("The largest number = " + num1);
		else
			System.out.println("The largest number = " + num2);

	}

}
