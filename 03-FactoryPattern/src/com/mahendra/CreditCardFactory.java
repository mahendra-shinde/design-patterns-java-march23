package com.mahendra;

public class CreditCardFactory {
	
	public CreditCard create(String name, String expiry) {
		CreditCard card = new CreditCard();
		card.setCardHolder(name);
		card.setExpiryDate(expiry);
		return card;
		
	}
}
