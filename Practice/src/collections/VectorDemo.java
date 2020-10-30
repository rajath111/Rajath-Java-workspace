package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String...strings) {
		Vector v = new Vector(10);
		System.out.println("Initial capacity : "+v.capacity());
		for(int i=0;i<10;i++) {
			v.add(i);
		}
		System.out.println("After loop capacity : "+v.capacity());
		v.add("Rajath");
		System.out.println("Increased capacity : "+v.capacity());
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println(v);
	}
}
