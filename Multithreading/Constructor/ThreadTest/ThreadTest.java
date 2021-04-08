package com.ThreadTest;

class MyRun implements Runnable{
	
	public void run() {}

}

public class ThreadTest {

	public static void main(String[] args) {
	  
		Thread t=new Thread(new MyRun(), "My Nmae");  /*Pass an object of MyRun() that is  runnable object and the name. So MyRun() is an anonymous object without any reference.
		I have created  an object and give it to thread class constructor. So we can give an object of  runnable  as well as name.*/

	}

}
