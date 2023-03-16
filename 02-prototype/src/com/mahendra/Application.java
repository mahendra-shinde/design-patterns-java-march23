package com.mahendra;

public class Application {

	public static void main(String[] args) {
		AccountManager manager = AccountManager.getInstance();
		Account a1 = manager.getSavingsAccount();
		Account a2 = manager.getSavingsAccount();
		
		System.out.println("a1 "+a1.getAccNo());
		System.out.println("a2 "+a2.getAccNo());

	}

}
