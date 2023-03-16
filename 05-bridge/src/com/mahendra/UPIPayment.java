package com.mahendra;

public class UPIPayment implements Payment {
	private String upiId;
	
	public UPIPayment(String upiId) {
		this.upiId = upiId;
	}
	
	@Override
	public void pay(double amount) {
	System.out.println("Paid using UPI, amount "+amount+" to "+ upiId);
		
	}
}
