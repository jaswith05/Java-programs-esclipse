package practice;
import java.util.*;
import java.util.Scanner;

public class HashMapUseCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of patients");
		int a=sc.nextInt();
		sc.nextLine();
		Map<Integer, String> map= new HashMap();
		
		while(map.size()<a) {
			System.out.println("Enter the name of patient");
			String name=sc.nextLine();
			
			if(map.containsValue(name)) {
				System.out.println("Name alredy exists");
				continue;
			}
			
			System.out.println("Enter the id of patient: ");
			int id=sc.nextInt();
			sc.nextLine();
			
			if(map.containsKey(id)) {
				System.out.println("Id alredy exists");
			}
			else {
				map.put(id, name);
				System.out.println("Patient registerd sucessfully");
				
			}
			
		}
		System.out.println("Registered Patients names and ids:"+map);
		sc.close();
		// TODO Auto-generated method stub

	}

}
