package com.mahendra;

public class AccountManager {
	// One and Only static variable 
	private static AccountManager instance = new AccountManager();
	
	// A Static method to ACCESS the one and only instance
	public static AccountManager getInstance() {
		System.out.println("Requesting an instance of AccountManager");
		return instance;
	}
	// Mark constructor as private
	private AccountManager() {
		System.out.println("Creating instance of Account Manager");
	}
}
