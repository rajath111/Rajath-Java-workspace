package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(100);
		t.add(5);
		t.add(12);
		t.add(19);
		System.out.println("Tree Set with default sorting order : "+t);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>(new Desc());		
		t1.add(10);
		t1.add(20);
		t1.add(100);
		t1.add(5);
		t1.add(12);
		t1.add(19);
		System.out.println("Tree Set with descending sorting order : "+t1);
	}

}
