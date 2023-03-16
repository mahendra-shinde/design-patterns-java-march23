package com.mahendra;

public class Application {
public static void main(String[] args) {
	SimpleInterestCalculator calc = new SimpleInterestCalculator(5000, 22, 100);
	System.out.println("Without DECORATOR: ");
	System.out.println(calc.calculate());
	
	System.out.println("With Decorator :");
	/// DECORATOR NEVER CAN REPLACE THE INTERNAL COMPONENT !
	ValidatedInterestCalculator calc2 = new ValidatedInterestCalculator(calc);
	System.out.println(calc2.calculate());
	
	
}
}
