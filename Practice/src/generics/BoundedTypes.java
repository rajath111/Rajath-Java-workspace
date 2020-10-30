package generics;

class Bounded<T extends Number>{
	T obj1;
	T obj2;
	Bounded(T a,T b){
		obj1 = a;
		obj2 = b;
	}
	
	void show() {
		System.out.println("The data is "+obj1+" "+obj2);
	}
	
	void perform() {
		//System.out.println("The sum is "+(obj1+obj2));
		//System.out.println("The product is "+(obj1*obj2));
		//System.out.println("The difference is "+(obj1-obj2));
	}
};

class UnBounded<T>{
	T obj1;
	T obj2;
	UnBounded(T a,T b){
		obj1 = a;
		obj2 = b;
	}
	
	void show() {
		System.out.println("The data is "+obj1+" "+obj2);
	}
	
	void perform() {
		//System.out.println("The sum is "+(obj1+obj2));
		//System.out.println("The product is "+(obj1*obj2));
		//System.out.println("The difference is "+(obj1-obj2));
	}
};

public class BoundedTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bounded<Integer> b1 = new Bounded<Integer>(19,28);
		b1.show();
		b1.perform();
		
		//Bounded<String> b2 = new Bounded<String>("Rajath","Kavya");
		
	}

}
