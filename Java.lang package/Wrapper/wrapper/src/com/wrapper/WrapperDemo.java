package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {

		Integer a = Integer.valueOf(10);
		Integer b = 10;

		Byte c = 15;
		Byte d = Byte.valueOf("15");

		Short f = Short.valueOf("123");

		Float g = 12.3f;

		Double j = Double.valueOf(123.456);

		Character k = Character.valueOf('A');

		Boolean l = Boolean.valueOf("true");

		byte bb = 15;
		Byte e = Byte.valueOf(bb);

		Float h = Float.valueOf("123.5");
		float x = h.floatValue(); // Unboxing...float x is primitive...
		float y = h; //Auto unboxing.It will automatically call dot float value and it will store in primitive.

		int m = 10;
		// Integer n=Integer.valueOf(m);
		Integer n = m;
		// int p=n.intValue();
		int p = n;
		
	}

}
