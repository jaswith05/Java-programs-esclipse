package jaswithp;

import java.util.Scanner;

public class Wrapperusecase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		
		System.out.println("enter age");
		Integer age= sc.nextInt();
		
		System.out.println("Enter cibil");
		Integer cibil=sc.nextInt();	
		
		System.out.println("Enter no of incomes");
		int incomes=sc.nextInt();
		double totalinc=0;
		
		for(int i=1 ;i<incomes+1; i++) {
			System.out.println("Enter"+i+"th income:");
			double inc=sc.nextDouble();
			totalinc=totalinc+inc;
		}
		
		if(totalinc<50000 && cibil<700 && age<18) {
			System.out.println("Loan not eligible");
		}
		else {
			System.out.println("Loan Eligible");
		}
			

	}

}
