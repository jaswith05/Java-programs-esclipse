package jaswithp;

import java.util.Scanner;
public class scorepassing {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the name");
		String s= scan.nextLine();
		System.out.println("English marks:");
		int a=scan.nextInt();
		System.out.println("Maths Marks:");
		int b=scan.nextInt();
		
		System.out.println(s);
		System.out.println("English:"+a);
		System.out.println("Maths:"+b);
		int result=a+b;
		System.out.println("Total:"+result);
		float percentage= result/2;
		System.out.println("Percentage:"+percentage+"%");
		if (percentage>=90) {
			System.out.println("Grade: A");
		}
		else {
			if(percentage>=75) {
				System.out.println("Grade: B");
			}
			else if(percentage>=50) {
				System.out.println("Grade: C");
			}
			else if(percentage<50) {
				System.out.println("Fail");
			}
			
		}
	}

}
