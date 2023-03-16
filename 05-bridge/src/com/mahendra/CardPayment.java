package com.mahendra;


enum CardType {
	DebitCard,
	CreditCard
}

public class CardPayment implements Payment {

	
	private CardType type;
	private String cardNumber;
	

	public CardPayment(CardType type, String cardNumber) {
		super();
		this.type = type;
		this.cardNumber = cardNumber;
	}


	@Override
	public void pay(double amount) {
		System.out.println("Paid using "+type+" Rs "+amount);	
	}

}
