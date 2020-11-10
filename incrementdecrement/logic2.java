package example;

class Test {
	public static void main(String[] args) {

		int a = 20;
		a = --a - --a;
		System.out.println(a);

		int b = 20;
		b = b-- + ++b;

		System.out.println(b);

		int c, d;
		c = 10;
		d = ++c;
		System.out.println(c);
		
		//or
		
		int e, f;
		e = 10;
		f = ++e;
		System.out.println(f);
		
		

	}
}