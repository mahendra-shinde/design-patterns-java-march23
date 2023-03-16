package com.mahendra;

import java.util.Calendar;
import java.util.Date;

public class CreditCardFactory2 extends CreditCardFactory {
	
	public CreditCard create(String name) {
		Date dt = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int yr = cal.get(Calendar.YEAR);
		int mn = cal.get(Calendar.MONTH);
		yr += 2;
		return super.create(name,mn+"/"+yr );
	}
	@Override
	public CreditCard create(String name, String expiry) {
		return super.create(name, expiry);
	}
}
