package com.paymentsystem;

public abstract class payment {
	private double amt;
	
	public payment(double amt) {
		this.amt=amt;
	}
	
	public double getamt() {
		return amt;
	}
	public abstract void prcesspmt();
}
