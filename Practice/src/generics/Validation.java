package generics;

import java.util.ArrayList;

public class Validation {
	public static void m1(ArrayList<String> l) {
		
	}
	
	//public static void m1(ArrayList<Integer> l) {
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l1 = new ArrayList<String>();
		l1.add("Rajath");
		l1.add(9);
		l1.add(10.6);
		l1.add(true);
		
		System.out.println(l1);
		
		
		ArrayList<String> l2 = new ArrayList();
		l2.add("Rajath");
		l2.add("Kavya");
		//l2.add(2);
		//l2.add(true);
		
		System.out.println(l2);
		
	}

}
