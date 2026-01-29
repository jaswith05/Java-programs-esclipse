package com.paymentsystem;

public class creditcard  extends payment{
	public creditcard (double amt) {
		super(amt);
	}
	
	public void	prcesspmt() {
		System.out.println("Credit card payment is processing");
		System.out.println("ID=1234434");
	}
}
