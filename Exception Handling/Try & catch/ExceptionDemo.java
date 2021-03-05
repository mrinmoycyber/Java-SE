/**
 * The ExceptionDemo class implements an application that
 * simply check try and catch block
 */

package exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10, b = 0, c;

		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e)  {
			System.out.println("Denominator should not be 0, try again");
		}
		System.out.println("Bye");

	}
}
