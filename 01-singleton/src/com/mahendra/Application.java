package com.mahendra;

import java.util.Calendar;

public class Application {

	public static void main(String[] args) {
		System.out.println("Launching an application");
		AccountManager manager1 = AccountManager.getInstance();
		AccountManager manager2 = AccountManager.getInstance();
		System.out.println("Is it really SAME object reffered by two variables");
		System.out.println("manager 1 "+manager1);
		System.out.println("manager 2 "+manager2);
		
		Calendar cal = Calendar.getInstance();
	}

}
