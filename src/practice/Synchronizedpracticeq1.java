package practice;
import java.util.*;
	
	public class Synchronizedpracticeq1  implements Runnable{
		private int balance=10000;
		
		public void withdraw(int amt) {
			
			if(amt<=balance) {
					balance-=amt;
					System.out.println("Remaining amount"+balance);}
			
			else {
					System.out.println("Insufficent balance");
						
				}
			
		}
			@Override
			public void run() {
				// TODO Auto-generated method stub
				withdraw(300);
			}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Synchronizedpracticeq1 syn= new Synchronizedpracticeq1();
			
			Thread t1=new Thread(syn, "thread1");
			Thread t2=new Thread(syn, "thread2");
			
			t1.start();
			t2.start();
	
		}
}