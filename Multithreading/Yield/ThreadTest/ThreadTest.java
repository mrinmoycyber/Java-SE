/**/

package com.ThreadTest;

class MyThread extends Thread {

	public void run() {

		int count = 1;
		
		while (true) { // infinite loop
			System.out.println(count++ +"My thread");
		}

	}

}

public class ThreadTest {

	public static void main(String[] args) throws Exception {

		MyThread t = new MyThread();
		t.start();
		
		int count = 1;
		
		while (true) { // infinite loop
			System.out.println(count++ +"Main");
			Thread.yield(); // it will give more time to My thread. "Check o/p" video-188
		}
		
	}

}
