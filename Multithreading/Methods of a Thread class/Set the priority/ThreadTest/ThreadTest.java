

package com.ThreadTest;

class MyThread extends Thread{  //Thread is parent class or super class  for MyThread, which is having a constructor for taking a name of a thread.So we should call the constructor of a super class.
	
	public MyThread(String name) {
		
		super(name); // this is how we can pass the name to a super class constructor.
		setPriority(Thread.MIN_PRIORITY+2); //for MIN_PRIORITY+2 = 1+2  o/p-> Priority- 3
		
	}
}
public class ThreadTest {

	public static void main(String[] args) throws Exception {
	  
		MyThread t = new MyThread("My Thread 1");  // This is how we can call the constructor of a super class inside our extended classes of our thread.
		System.out.println("ID "+ t.getId());
		System.out.println("Name "+ t.getName());
		System.out.println("Priority "+ t.getPriority());
		t.start();
		System.out.println("State "+ t.getState());
		System.out.println("Alive "+ t.isAlive());

	}

}
