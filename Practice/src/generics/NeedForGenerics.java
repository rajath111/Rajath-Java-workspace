package generics;

import java.util.ArrayList;
import java.util.List;

public class NeedForGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[5];
		name[0] = "Rajath";
		name[1] = "Kavya";
		//name[2] = 10;     //Array provides type safety, as it is homogeneous
							//Gives compile time error, not run time error
		name[2] = "Sony";
		
		System.out.println("Names in Array");
		for(int i=0;i<3;i++)
			System.out.println(name[i]);
		
		
		ArrayList list = new ArrayList();
		list.add("Rajath");      //Collections does not provide type safety, as they are heterogeneous
		list.add("Kavya");		 //They do not cause compile time error instead causes runtime error 
		list.add("Sony");		//Which is not recommonded
		//list.add(new Integer(2));
		
		System.out.println("Names in Collection!");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getClass().getName());
			String s = (String)list.get(i);
			System.out.println(s);
			
			
			//So, in order to provide type safety and to solve type casting problem in Collections
			//Generics is used
		}
		
		List<String> l1 = new ArrayList<String>();       //correct
		
		ArrayList<String> l2 = new ArrayList<String>();  //correct
		
		//ArrayList<Object> o1 = new ArrayList<String>();//wrong
		
		//ArrayList<int> l3 = new ArrayList<int>();      //wrong
		
	}

}
