/*When main method is terminating  the daemon thread is also terminating and yes, it's inside a infinite loop*/

package com.ThreadTest;

class MyThread extends Thread {

	public void run() {

		int count = 1;
		while (true) { // infinite loop
			System.out.println(count++);
		}

	}

}

public class ThreadTest {

	public static void main(String[] args) throws Exception {

		MyThread t = new MyThread();
		t.setDaemon(true); // Daemon thread are dependent threads,So if the main application is
							// terminating, then daemon thread also terminating.
		t.start();

		try {
			Thread.sleep(100);
		} catch (Exception e) {

		}
		
	}

}
