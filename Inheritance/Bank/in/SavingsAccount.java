package com.bank.in;

//Subclass
public class SavingsAccount extends Account {
	
	public SavingsAccount(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
	}

	// Client Deposits Money to the account
	public void deposit(long moneyToDeposit) {
		super.balance = moneyToDeposit;
	}

	// Withdraw
	public void withdrawFromAccount(long withdrawAmount) {
		super.balance -= withdrawAmount;
	}

	// PayEMI
	public void payEMI() {
		super.balance -= 10;
	}
}
