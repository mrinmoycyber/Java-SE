package com.collectionbank.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {

	String accno;
	String name;
	double balance;

	Account() {
	}

	Account(String a, String n, double b) {
		accno = a;
		name = n;
		balance = b;
	}

	public String toString() {
		return "Account No:" + accno + "\nName:" + name + "\nBalance:" + balance + "\n";
	}

}

public class CollectionBankAccount {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		// Just a reference of account.
		Account acc = null;
		HashMap<String, Account> hm = new HashMap<>(); // Key -> String, Value -> Account

		/**
		 * As per the condition, whenever the application is opening it should bring all
		 * the contains from the file and store it in HashMap. [FileInputStream is doing
		 * it]
		 */

		try { /*
				 * All these things I have written in try and catch. Though I have throws
				 * exception in the main method but still I wrote this because when we first
				 * time run the application. This file [Accounts.txt] may not be there very
				 * first time. And if the file is not there,nothing is there in the file and
				 * then it will cause exception and the program will crash. Because I am not
				 * handling excptions. I'm just throwing exception[throws Exception]. I want the
				 * program to continue. So I have written this entire process of reading from
				 * the file in a Try and Catch Block.I am not displaying anything in catch So
				 * the first time if File is not there, then it will not cause any error because
				 * FileInputStream required a existence of file. If file is not existing then
				 * it's an error. It's an exception.
				 */

			FileInputStream fis = new FileInputStream("Accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			// How many accounts are there in that file
			int count = ois.readInt();
			for (int i = 0; i < count; i++) {
				acc = (Account) ois.readObject();
				System.out.println(acc); // Displaying account details
				hm.put(acc.accno, acc); // Putting them into the HashMap
			}

			fis.close();
			ois.close();

		} catch (Exception e) { // I am not displaying anything in catch

		}
		
		/**
		 * Here, even if file is not there, the file will be creatd.
		 */
		FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        System.out.println("Menu");
        
        //Temporary variables that are useful for menu driven part
        int choice;
        String accno, name;
        double balance;
        
        do {
        	// Displaying entire menu
        	System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice ");
            choice=sc.nextInt();  // Reading the choice from the keyboard
            
            /*Ignore any new line characters or carriage returns. Before reading string it's better we clear. 
            If there are any \n's keyboard buffer. So for ignoring or skipping them this is the syntax.
            We can mention here regular expression and mention what are the characters it should skip.So \n, \r, and these are unicode
            But it's different on different OS. So this is like a complete string we can use for skipping those new line characters. 
             */ 
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice)                                     
            {
                 // Asking the details of  the account
                case 1: System.out.println("Enter Details Accno, Name ,balance ");  
                        accno=sc.nextLine();
                        name=sc.nextLine();
                        balance=sc.nextDouble();
                        acc=new Account(accno,name,balance);   // Creating an account 
                        hm.put(accno, acc);                    // Putting that account into HashMap
                        System.out.println("Account Created for "+name); // Displaying the message for customer
                        break;
                case 2: System.out.println("Enter Accno");     
                        accno=sc.nextLine();                  // Reading the account number
                        hm.remove(accno);                     // From HashMap removing the particular entry with this account number.
                        break;
                case 3: System.out.println("Enter Accno");     
                        accno=sc.nextLine();                  // Taking the account numbeer
                        acc=hm.get(accno);                    // Getting the details of the account from HashMap
                        System.out.println(acc);              // Showing the account details  
                        break;
                case 4:                                      
                        for(Account a:hm.values())            // Foreach loop is used for displaying all the account details 
                            System.out.println(a);
                        break;
                        
                case 5:                                     // save
                	
                 // Save it. Case 5 & case 6 both will save it. Because before existing also we should save it.
                	
                /*The very first thing I write is the size of the HashMap.So how many objects are there?
                 * I'm saving all these objects from the HashMap account, objects from the HashMap into a file using object output stream,
                 * writing all the objects using foreach loop. */	
                	
                case 6: oos.writeInt(hm.size());            
                            
               // Next I'm writing all the objects using foreach loop.   
                        for(Account a:hm.values())      
                            oos.writeObject(a);         
            }
        	
        } while(choice!=6);
        oos.flush();
        oos.close();
        
        fos.close();      

	}

}
