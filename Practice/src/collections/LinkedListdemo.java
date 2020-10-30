package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i=0;i<15;i++) {
			list.add(i);
		}
		System.out.println(list);
		list.addLast("Kavya");
		list.addLast("Junior");
		list.add("Rajath");

		
		ArrayList arr = new ArrayList(list);
		
		Iterator itr =  list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
		arr.add("Family");
		System.out.println("The linked liist after removing : "+list);
		itr = arr.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
