package com.BreakContinue;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		int num = 0;
		while (num <= 100) {
			System.out.println("Value of variable is: " + num);
			if (num == 2) {
				break;
			}
			num++;
		}
		System.out.println("Out of while loop");

		for (int j = 0; j <= 6; j++) {
			if (j == 5) {
				continue; /*
							 * As we may have noticed, the value of 5 is missing the output,Why? because
							 * when the value of variable j is 5, the program encountered a continue
							 * statement, which makes it to jump at the beginning of for loop for next
							 * iteration, skipping the statement, for current iteration(that's the reason
							 * println didn't execute when the value of j was 5)
							 */
			}
			System.out.println(j + " ");
		}
	}
}