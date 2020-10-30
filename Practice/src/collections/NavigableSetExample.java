package collections;

import java.util.*;

public class NavigableSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeMap<Integer,Integer> map = new TreeMap<>();
		for(int i=0;i<15;i++) {
			set.add(i*3);
			map.put(i, i*i);
		}
		set.add(23);
		System.out.println(set);
		System.out.println("Ceiling of 23 "+set.ceiling(23));
		System.out.println("Higher of 23 "+set.higher(23));
		System.out.println("Lower of 23 "+set.lower(23));
		System.out.println("Floor of 23 "+set.floor(23));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println("Set after alteration : "+set);
		
		System.out.println("*****************************************************************************************");
		System.out.println("The map is "+map);
		System.out.println("Ceiling of 5 "+map.ceilingKey(5));
		System.out.println("Higher of 5 "+map.higherKey(5));
		System.out.println("Lower of 5 "+map.lowerKey(5));
		System.out.println("Floor of 5 "+map.floorKey(5));
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println("Map after alteration : "+map);
	}

}
