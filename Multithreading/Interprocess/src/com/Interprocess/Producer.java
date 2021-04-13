package com.Interprocess;

public class Producer extends Thread {

	MyData data;

	public Producer(MyData d) {
		data = d;

	}

	// Run method will call set method
	public void run() {

		int count = 1;
		while (true) {

			data.set(count);

			// Producer value
			System.out.println("Producer " + count);
			count++;

		}

	}

}
