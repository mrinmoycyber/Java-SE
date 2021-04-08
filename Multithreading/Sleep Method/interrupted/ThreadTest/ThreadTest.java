/*If I'm writing my own class that is extending from third class the how to give the name */

package com.ThreadTest;

class MyThread extends Thread{  //Thread is parent class or super class  for MyThread, which is having a constructor for taking a name of a thread.So we should call the constructor of a super class.
	
	public MyThread(String name) {
		
		super(name); // this is how we can pass the name to a super class constructor.
		
	}
	
	public void run() {
		
		int count=1;
		while(true) {
		System.out.println(count++);
		try {
		Thread.sleep(1000);  // sleep time 1000 milli secs.
		}
		catch(InterruptedException e){
			System.out.println(e);
			}
		}
		
	}
	
}

public class ThreadTest {

	public static void main(String[] args) throws Exception {
	  
		MyThread t = new MyThread("My Thread 1");  // This is how we can call the constructor of a super class inside our extended classes of our thread.
		t.start();
		t.interrupt(); // I call it only one time. So after printing first number one, it was sleeping main method has interrupted.
		
	}

}
