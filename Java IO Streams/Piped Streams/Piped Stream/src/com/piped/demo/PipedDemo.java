package com.piped.demo;

import java.io.*;

class Producer extends Thread {
	OutputStream os;

	/**
	 * @param o 
	 * Producer is taking a o/p stream keeping in it's own reference os.
	 *          Then using a infinite loop it's go on writing the values that's
	 *          natural number and it's keep on incrementing the natural number.
	 *          It's also displaying on the screen what it has produced. So,it's
	 *          sending on a o/p stream/
	 */

	public Producer(OutputStream o) {
		os = o;
	}

	public void run() {
		int count = 1;

		while (true) {
			try {
				os.write(count);
				os.flush(); /** Producer will write inside a output stream but there is no guarantee that the data is send on the other side
				             so it's better we use flush. To make sure that data is send on the other side.  
				            */
				System.out.println("Produce " + count);
				System.out.flush();
				
			// After flush since we want to have pipes in a synchronized manner
				
			Thread.sleep(10);
				count++;
			} catch (Exception e) {}

		}

	}

}

class Consumer extends Thread {
	InputStream is;

	/**
	 * @param s 
	 * Consumer is reading contents from input stream in it's infinite loop
	 *          and it's also printing on the screen what it has consumed
	 */

	public Consumer(InputStream s) {
		is = s;
	}

	public void run() {
		int x;

		while (true) {
			try {
				x = is.read();
				System.out.println("Consumer " + x);
				System.out.flush();
				Thread.sleep(10);
			} catch (Exception e) {
			}

		}

	}

}

public class PipedDemo {

	public static void main(String[] args) throws Exception {

		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		pos.connect(pis);
        // pis.connect(pos);
		
		// Creating object of Producer 
		Producer p = new Producer(pos);
		
		// Creating object of Consumer
		Consumer c = new Consumer(pis);
		
		   /* Note that the value of producer when converted to consumer goes from int to byte
	        * So circular rotation of consumer [ after 255 it again start from 1 (CONSUMER) ]
	        * */
		
		p.start();
		c.start(); // [after 255 it again start  from 1]
		
	}

}
