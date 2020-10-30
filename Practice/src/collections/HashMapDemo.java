package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String...strings) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(105,"Rajath");
		map.put(426,"Boss");
		map.put(100,"Indu");
		map.put(140256,"Junior");
		System.out.println(map);
		
		map.put(1,"Unknown");
		System.out.println(map);
		map.remove(1);
		System.out.println(map);
		
		Set s = map.entrySet();
		System.out.println("Entry Set: "+s);
		Set s1 = map.keySet();
		System.out.println("Key Set: "+s1);
		
		Collection c = map.values();
		System.out.println("The values are : "+c);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			String temp = (String)e.getValue();
			if(temp.equals("Junior"))
				e.setValue("Junior Boss");
		}
		System.out.println("After all : "+map);
	}
}
