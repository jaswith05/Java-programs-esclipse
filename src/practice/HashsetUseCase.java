package practice;
import java.util.*;

public class HashsetUseCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of patients");
		int a=sc.nextInt();
		
		HashSet<Integer> set= new HashSet<>();
		
		while(set.size()<a) {
			System.out.println("Enter the id of patient: ");
			int id=sc.nextInt();
			if(!set.add(id)) {
				System.out.println(id+" alredy registerd. please enter another id");
			}
		}
		System.out.println("Registerd patients"+set);
		sc.close();
		// TODO Auto-generated method stub

	}

}
