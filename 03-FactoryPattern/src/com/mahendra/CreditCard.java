package com.mahendra;

public class CreditCard {
	private String cardHolder ;
	private String expiryDate;
	
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CreditCard [cardHolder=" + cardHolder + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
