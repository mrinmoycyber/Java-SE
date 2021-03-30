package com.threadTest;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread m = new MyThread();
		m.start();
		int i =1;
		
		while (true) {
			
			System.out.println(i+"World");
			
		}
		

	}

}
