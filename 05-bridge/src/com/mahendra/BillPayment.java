package com.mahendra;

public class BillPayment {
	public void payBill(double amount, Payment payment) {
		System.out.println("Initiating the bill payment....");
		payment.pay(amount);
	}
	
	public static void main(String[] args) {
		Payment cardPayment = new CardPayment(CardType.DebitCard, "237235476253");
		Payment uPIPayment = new UPIPayment("88888999");
		String paymentType = "upi";
		
		BillPayment bill = new BillPayment();
		
		switch(paymentType.toLowerCase()) {
		case "card":
			bill.payBill(1000,cardPayment);
			break;
		case "upi":
			bill.payBill(1000, uPIPayment);
			break;
		default:
			System.out.println("Invalid method selected");
		}
	}
}
