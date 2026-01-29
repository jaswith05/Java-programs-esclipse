package com.paymentsystem;

public class upipayment extends payment {
	public upipayment(double amt) {
		super(amt);
	}
	
	
	public void prcesspmt() {
		System.out.println("Upi payment is processing");
		System.out.println("ID=1234434");
	}

}
