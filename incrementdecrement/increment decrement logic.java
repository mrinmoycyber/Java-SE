package example;

class Test {
	public static void main(String[] args) {

		int a = 34;
		int b = 21;
		int c = a++ + ++b;
		int d = --a + --b + c--;
		int e = a + +b + +c + d--;
		int f = -a + b-- + -c - d++;
		int sum = a + b + c + d + e + f;
		System.out.println("sum = " + sum);

		int i = 100;
		int z = 100;
		System.out.println(i-- + z + 100 + --i);
		// i++,i-- executes after encountering the same variable in the same statement
		// or
		// else it will execute after the statement is finished ;

		int h = 20;
		h = ++h + ++h;
		//

		System.out.println(h);

		int j = 20;
		j = j-- + ++j;
		// 19+21=40

		System.out.println(j);
	}
}