package com.mahendra;

public class Application {

	public static void main(String[] args) {
		CreditCardFactory2 factory = new CreditCardFactory2();
		CreditCard card1 = factory.create("Rohit Sharma", "11/2030");
		CreditCard card2 = factory.create("K.L. Rahul");
		
		System.out.println(card1);
		System.out.println(card2);
	}

}
