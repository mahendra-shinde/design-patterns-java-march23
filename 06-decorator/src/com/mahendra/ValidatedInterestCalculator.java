package com.mahendra;

public class ValidatedInterestCalculator implements InterestCalculator{
	private SimpleInterestCalculator calculator;
	
	
	public ValidatedInterestCalculator(SimpleInterestCalculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Override
	public double calculate() {
		if(validate()) {
			return calculator.calculate();
		}
		return 0;
	}
	
	// Extra feature : Validation
	private boolean validate() {
		if(calculator.getAmount() < 10000 || calculator.getAmount() > 10000000 )
			return false;
		else if (calculator.getRateInterest() < 4 || calculator.getRateInterest() > 18 )
			return false;
		else if (calculator.getDuration() < 6 || calculator.getDuration() > 60 )
			return false;
		else
			return true;
	}
	
}
