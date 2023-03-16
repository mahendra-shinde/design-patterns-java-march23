package com.mahendra;

import java.util.Date;

public class AccountManager {
	// One and Only static variable 
	private static AccountManager instance = new AccountManager();
	private static int SA_COUNTER = 0;
	private static int CA_COUNTER = 0;
	private static int OD_COUNTER = 0;
	// A Static method to ACCESS the one and only instance
	public static AccountManager getInstance() {
		System.out.println("Requesting an instance of AccountManager");
		return instance;
	}
	// Mark constructor as private
	private AccountManager() {
		System.out.println("Creating instance of Account Manager");
		savingsAccount = new Account();
		savingsAccount.setType("Savings");
		
		currentAccount = new Account();
		currentAccount.setType("Current");
		
		overdraftAccount = new Account();
		overdraftAccount.setType("Overdraft");
	}
	
	// Define the prototypes
	private Account savingsAccount, currentAccount, overdraftAccount;

	public Account getSavingsAccount() {
		Account acc1 = null;
		try {
		 acc1 = (Account)savingsAccount.clone();
		SA_COUNTER++;
		acc1.setAccNo("SB1000"+SA_COUNTER);
		acc1.setOpeningDate(new Date());
		
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return acc1;
	}
	
	public Account getCurrentAccount() {
		return currentAccount;
	}
	public Account getOverdraftAccount() {
		return overdraftAccount;
	}
		
}
