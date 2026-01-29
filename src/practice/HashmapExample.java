package practice;

import java.util.*;
import java.util.Map;
 
public class HashmapExample {
public static void main(String[] args)
{
Map<Integer, String>Employee = new HashMap<>();
//HashMap<Integer, String>Employee1= new HashMap<>();
 
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, " Renu ");
		Employee.put(102, " Sohan");
		
		System.out.println(Employee.get(102));
		System.out.println(Employee.containsKey(103));
		System.out.println(Employee.containsValue("Sonali "));
		System.out.println(Employee.keySet());
		System.out.println(Employee.values());
		System.out.println(Employee.entrySet());
		System.out.println(Employee.size());
		System.out.println(Employee.isEmpty());
		System.out.println(Employee.replace(101, "jaswith"));
		System.out.println(Employee.entrySet());
		System.out.println(Employee.remove(101));
		System.out.println(Employee.entrySet());
		
 
	}
 
}
 