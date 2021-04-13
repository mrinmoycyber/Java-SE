package com.Interprocess;

public class Consumer extends Thread {

	MyData data;

	public Consumer(MyData d) {
		data = d;

	}

	// Run method will get the value
	public void run() {

		int value = 1;
		while (true) {

			value = data.get();

			// Consumer will display the value
			System.out.println("Consumer " + value);

		}

	}

}
