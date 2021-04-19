package com.Bank;

public class ATM {

	synchronized public void checkBalance(String name) {

		System.out.print(name + " Checking ");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println("Balance");
	}

	synchronized public void withdraw(String name, int amount) {

		System.out.print(name + " Withdrawing ");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		System.out.println(amount);

	}
	
}

class Customer extends Thread {

	String name;
	int amount;
	ATM atm;

	Customer(String n, ATM a, int amt) {

		name = n;
		atm = a;
		amount = amt;

	}

	public void useAtm() {

		atm.checkBalance(name);
		atm.withdraw(name, amount);

	}

	public void run() {

		useAtm();

	}

	public static void main(String[] args) {

		// Create an object
		ATM atm = new ATM();
		Customer c1 = new Customer("Ram", atm, 1000);
		Customer c2 = new Customer("Sam", atm, 2000);
		c1.start();
		c2.start();

	}

}
