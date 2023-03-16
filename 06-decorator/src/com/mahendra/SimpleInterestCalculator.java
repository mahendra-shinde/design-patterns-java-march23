package com.mahendra;

public class SimpleInterestCalculator implements InterestCalculator {
	private double amount;
	private double rateInterest;
	private int duration;
	
	public double getAmount() {
		return amount;
	}

	public double getRateInterest() {
		return rateInterest;
	}

	public int getDuration() {
		return duration;
	}

	public SimpleInterestCalculator(double amount, double rateInterest, int duration) {
		super();
		this.amount = amount;
		this.rateInterest = rateInterest;
		this.duration = duration;
	}
	
	public double calculate() {
		return amount * (rateInterest/100) * duration/12 ;
	}
}
