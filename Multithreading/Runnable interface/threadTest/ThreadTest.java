package com.threadTest;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread m = new MyThread();
		Thread th=new Thread(m);
		th.start();
		int i =1;
		
		while (true) {
			
			System.out.println(i+"World");
			
		}
		

	}

}
