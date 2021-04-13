package com.Interprocess;

class MyData {

	int value;
	boolean flag = true;

	// Writing the value
	synchronized public void set(int v) {

		while (flag != true)

			try {
				wait();
			} catch (Exception e) {

			}

		value = v;
		flag = false;
		notify();

	}

	// Reading the value
	synchronized public int get() {

		int x = 0;

		while (flag != false)

			try {
				wait();
			} catch (Exception e) {

			}

		x = value;
		flag = true;
		notify();

		return x;

	}

}

public class InterProcess {

	public static void main(String[] args) {

		// Create an Object
		MyData data = new MyData();

		// Data object shared both Producer and Consumer
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);

		p.start();
		c.start();

	}

}
