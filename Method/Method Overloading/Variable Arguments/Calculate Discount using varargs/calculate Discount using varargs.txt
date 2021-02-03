//Calculate Discount using varargs

package com.mrinu;

public class CalculateDiscount {
	double discount(double... P) {
		double sum = 0;
		for (int i = 0; i < P.length; i++) {
			sum += P[i];
			if (sum < 500)
				return sum * 0.10;
			else if (sum >= 500 && sum < 1000)
				return sum * 0.15;
			else
				return sum * 0.20;
		}
		return sum;
	}

	public static void main(String[] args) {
		CalculateDiscount ab = new CalculateDiscount();
		System.out.println(ab.discount(500));

	}

}
