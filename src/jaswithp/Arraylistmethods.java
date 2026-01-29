package jaswithp;
import java.util.*;
public class Arraylistmethods {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of inputs");
		int n=sc.nextInt();
		ArrayList<Integer> list= new ArrayList();
		for(int i=0; i<n;i++) {
			int a= sc.nextInt();
			list.add(a);
		}
		
		int b=list.size();
		int c=list.remove(3);
		int x=list.get(0);
		int y=list.indexOf(a);
		

}
