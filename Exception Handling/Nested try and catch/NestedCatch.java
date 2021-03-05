package nestedcatch;

public class NestedCatch {

	public static void main(String[] args) {

		int A[] = { 30, 20, 40, 10, 0 };

		try {
			int c = A[0] / A[4];
			System.out.println("Division is: " + c);

			System.out.println(A[3]);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("Denominator should not be zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid");
		}
		
		System.out.println("Bye");
		
	}

}
