package com.bank.in;

public class ClientMain {

	public static void main(String[] args) {
		SavingsAccount Nirmay = new SavingsAccount("565656", "Nirmay", "Bankra", "999", "1994");
		Nirmay.deposit(50000);
		System.out.println("Balance in my new Account: "+Nirmay.getBalance());
		Nirmay.withdrawFromAccount(2000);
		System.out.println("Balance in my new Account After Withdral of 2000 : "+Nirmay.getBalance());
		Nirmay.payEMI();
		System.out.println("Balance in my new Account After EMI of 10 : "+Nirmay.getBalance());
	}

}
