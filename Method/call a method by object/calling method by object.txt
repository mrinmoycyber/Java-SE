//calling method by object

package com.mrinu;

public class CallingMethodByObject {
	int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		int a = 10, b = 15;
		CallingMethodByObject mo = new CallingMethodByObject();
		System.out.println(mo.max(a, b));

	}

}
