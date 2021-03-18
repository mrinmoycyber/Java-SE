//Take values of length and breadth of a rectangle from user and check if it is square or not
package checking;
import java.util.Scanner;
public class RectangleSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		int a =sc.nextInt();
System.out.println("Enter Breadth");
int b = sc.nextInt();
if (a==b) {
	System.out.println("Square");
}
else {
	System.out.println("Rectangle");
}
	}

}
