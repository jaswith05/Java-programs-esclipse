package practice;

import java.util.Scanner;

public class Paymentmainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The amount");
		int amt=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the mode of Payment");
		String a=sc.nextLine();
		CreditCardPayment c= new CreditCardPayment();
		UpiPayment u=new UpiPayment();
		
		if(a=="upi") {
			c.pay(amt);
		}
		
	}

}
