/*Propagation of exception*/

package throwthrowsdemo;

public class ThrowThrowsDemo {
	static int meth1() {
		return 10 / 0;
	}

	static void meth2() {  
		meth1();
	}

	static void meth3() {  
		meth2();
	}

	public static void main(String[] args) {
		try {
			meth3();
		} catch (Exception e) {    // I have handled inside the main method. So likewise  I can handle it inside meth3 also or 2 also or even inside meth1()
			System.out.println(e);
		}

	}

}
