package jaswithp;
import java.util.*;
public class Wrapperusecase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String subject;
		Integer marks;
		int avg=0;
		
		TreeMap<String, Integer> total =new TreeMap<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the subject");
			subject=sc.next();
			System.out.println("enter the marks");
			marks =sc.nextInt();
			total.put(subject, marks);
			avg=(avg+marks)/2;
		}
		System.out.println(total);
		System.out.println("Average:"+avg);
	}

}
