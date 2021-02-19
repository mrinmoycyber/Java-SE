package com.bank.in;

public class Account {
	
		private String accNo;
		private String name;
		private String address;
		private String phno;
		private String dob;
		protected long balance;

		//Parameterized Cons
		public Account(String acc, String n, String add, String phno, String dob) {
			accNo = acc;
			name = n;
			address = add;
			this.phno = phno;
			this.dob = dob;
			balance = 0; //Balance is HardCoded to 0
		}

		public Account() {
			System.out.println("Default Constructor");
		}

		public String getAccNo() {
			return accNo;
		}

		public String getName() {
			return name;
		}

		public String getAddress() {
			return address;
		};

		public String getPhno() {
			return phno;
		}

		public String getDOB() {
			return dob;
		}

		public long getBalance() {
			return balance;
		}

		public void setAddress(String add) {
			address = add;
		}

		public void setPhno(String phno) {
			this.phno = phno;
		}

	}


