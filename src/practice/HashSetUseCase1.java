package practice;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetUseCase1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of patients");
		int a=sc.nextInt();
		sc.nextLine();
		HashSet<String> names= new HashSet<>();
		
		while(names.size()<a){
			System.out.println("Enter the name of patient: ");
			String s=sc.nextLine();	
			if(!names.add(s)) {
				System.out.println("Patient name alredy Exists");
				System.out.println("Please Enter another name");
			}
		}
		
		HashSet<Integer> set= new HashSet<>();
		
		while(set.size()<a) {
			System.out.println("Enter the id of patient: ");
			int id=sc.nextInt();
			
			if(!set.add(id)) {
				System.out.println(id+" Id alredy registered");
				System.out.println("Please enter anthother id");
			}
		}
		System.out.println("Registered Patients names:"+names);
		System.out.println("Registerd patients"+set);
		sc.close();
		// TODO Auto-generated method stub

	}

}
