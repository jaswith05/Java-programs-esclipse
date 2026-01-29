package practice;

public class CreditCardPayment implements PaymentSystem{
	public void pay(int amt) {
		System.out.println("Credit card Payment porcessing"+amt);
	}
}
