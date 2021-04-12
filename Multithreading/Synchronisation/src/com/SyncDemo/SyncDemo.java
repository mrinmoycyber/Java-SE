package com.SyncDemo;

class MyData {

	synchronized public void display(String str) {

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			
			try {
				Thread.sleep(100);   /*If it's sleeping means other thread can enter in But no, it will not enter
				                                because I have used synchronized here. It will be printed slowly 
				                                but only one thread will print first then the next thread will use it.*/
			} catch (Exception e) {
			} 
			
		}

	}

}

class MyThread1 extends Thread {

	// Reference of MyData
	MyData d;

	// Reference of object of MyData
	public MyThread1(MyData d) {
		this.d = d;
	}

	// Run method call display of MyData
	public void run() {
		d.display("Hello World");
	}

}

class MyThread2 extends Thread {

	MyData d;

	public MyThread2(MyData d) {
		this.d = d;
	}

	public void run() {
		d.display("Welcome All");
	}

}

public class SyncDemo {

	public static void main(String[] args) {

		// Create object of MyData
		MyData data = new MyData();

		// Object of MyThread
		MyThread1 t1 = new MyThread1(data);
		MyThread2 t2 = new MyThread2(data);

		t1.start();
		t2.start();

	}

}
