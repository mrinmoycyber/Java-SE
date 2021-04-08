/*We will make the main method join other thread even if it's daemon thread. It should join means it should  wait for that thread to complete.*/

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
		t.setDaemon(true); 
		t.start();
		Thread mainThread = Thread.currentThread(); // this will give the reference of the current thread . So we will get the reference of daemon  thread..
		mainThread.join(); // It will join any other thread whichever it's running. 
		
	}

}
