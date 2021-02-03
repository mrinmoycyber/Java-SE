package importScanner;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		/*int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		num = obj.nextInt();*/
		
		//Nested If
		int number1 = 5;
		int number2 = 6;
		if(number1 == 5) {
			System.out.println("number 1 is greater than 5");
			if(number2 > 5) {
				System.out.println("number 2 is greater than 5 , A nested if example");
			}
		}else{
			System.out.println("number 1 is not greather than 5");
		}
		
	}

}
