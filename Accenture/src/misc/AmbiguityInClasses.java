package misc;

//import java.util.ArrayList;

import Demo.Demo1;

class ArrayList<R>{
	R value;
	 public ArrayList() {
		System.out.println("Local ArrayList was executed!!!!");
	}
	public void set(R a) {
		value = a;
	}
	public R get() {
		return value;
	}
};
public class AmbiguityInClasses {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.set("Rajath");
		System.out.println("The returned value by String generic is : "+a.get());
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.set(1928);
		
		System.out.println("The returned value by Integer generic is : "+b.get());
	}
	
	Demo1 d = new Demo1();

};
