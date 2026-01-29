package jaswithp;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlistusecase {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("how many patient details");
	int n= sc.nextInt();
	sc.nextLine();
	
LinkedList<String>patients=new LinkedList();

 for(int i=0;i<n;i++ ) {
	 System.out.println("enter value:");
	 String value=sc.nextLine();
	 patients.add(value); 
 }
 System.out.println("Enter the patient number");
 int pn=sc.nextInt();
 if(pn>0 && pn<=patients.size()) {
	 System.out.println(patients.get(pn));
 }
System.out.println("Enter the name of patient that u want to search");
String pna=sc.nextLine();
if(patients.contains(pna)) {
	System.out.println("Ture");
}

}
}
/*
patients.addFirst("Emergency-Suresh");
 
patients.addLast("Pooja");
 
System.out.println("Patient List:" + patients);
 
 
System.out.println("First Patient :" + patients.getFirst());
 
 
System.out.println("First Patient :" + patients.getLast());
 
System.out.println("Is Pooja present? " +patients.contains("Pooja"));
 
System.out.println("Postion of Deva: " +patients.indexOf("Deva"));
 
System.out.println("Treated Patient: " + patients.removeFirst());
patients.remove("Pooja");
 
System.out.println("Total Remaining Patients: " + patients.size());
 
System.out.println("Updated Patient List :");
 
for(String patient : patients)
{
	System.out.println(patient);
 
}
 
 
 
 
 
	
}
 
}*/