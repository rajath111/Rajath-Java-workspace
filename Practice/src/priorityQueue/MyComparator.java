package priorityQueue;

import java.util.*;



public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.toLowerCase().compareTo(o1.toLowerCase());
	}


	
}
