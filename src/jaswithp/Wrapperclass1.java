package jaswithp;

import java.util.ArrayList;


import java.util.*;

public class Wrapperclass1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> subject= new ArrayList();
		subject.add("english");
		subject.add("Maths");
		subject.add("Science");
		ArrayList<Integer> score= new ArrayList();
		score.add(24);
		score.add(44);
		score.add(55);
		
		for(int i=0;i<subject.size();i++) {
			System.out.println(subject.get(i)+":"+score.get(i));
		}

	}

}
