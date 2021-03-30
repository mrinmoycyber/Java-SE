package com.threadTest;

public class MyThread implements Runnable  {
	
	public void run() {
		
		int i =1;
		while(true) {
			System.out.println(i+"Hello");
		i++;
		}
		
	}

}
