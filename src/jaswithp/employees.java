package jaswithp;
import java.util.Scanner;
public class employees {
	public static void main(String[] args) {
		String a[]= {"Praboss","boss","naveen"};
		for(int i=0; i<a.length;i++) {
			String  s= a[i];
			if(s.length()>10) {
				System.out.println("Long Name");
			}
			else if(s.contains(" ")) {
				System.out.println("Employee:"+s+"Single Word Name");
			}
			else {
				System.out.println("Employee:"+s+"Normal Name");
			}
			System.out.println("Upper:"+s.toUpperCase());
			StringBuffer rev=new StringBuffer(s);
			System.out.println("Reverse:"+rev.reverse());
			StringBuilder app= new StringBuilder(s);
			System.out.println("Append:"+app.append("Verified"));
			
			
		}
	}

}
