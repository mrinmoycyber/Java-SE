
public class forEachLoop {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int x : a) {
			System.out.println(x);
		}
		int arr[] = { 2, 11, 45, 9 };
		for (int num : arr) {
			System.out.println(num);
		}
		/*
		 * In this example, I have declared the num as int in the enhanced for loop.
		 * This will change depending on the data type of array. For example, the
		 * enhanced for loop for string type would lokk like this--->>
		 */

		String arr1[] = { "Hello!", "Good Morning", "Can we talk?" };
		for (String str : arr1) {
			System.out.println(str);
		}
		String[] Cars = { "BMW", "Porsche" };
		for (String i : Cars) {
			System.out.println(i);
		}

	}

}
