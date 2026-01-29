package com.paymentsystem;
import java.util.Scanner;

public class paymentprocess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:");
		double amt=sc.nextDouble();
		
		
		paymentvalidator paymentcheck=amount -> amt<0;
		if(paymentcheck.validate(amt)) {
			System.out.println("Invalid amount");
			return;
		}
		
		System.out.println("Choose the paymet method");
		System.out.println("1.Credit payment");
		System.out.println("2.Upi payment");
		
		
		int choice=sc.nextInt();
		payment payment;
		
		if(choice==1) {
			payment=new creditcard(amt);
		}
		else {
			payment=new upipayment(amt);
		}
		
		payment.prcesspmt();
		// TODO Auto-generated method stub
		sc.close();

	}

}
