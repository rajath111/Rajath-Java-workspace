package generics;

public class Generic<T> {
	T obj;
	Generic(T a){
		obj = a;
	}
	public void show() {
		System.out.println("The type of object is "+obj.getClass().getName());
	}
	
	public T get() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> g1 = new Generic<String>("Rajath");
		
		Generic<Integer> g2 = new Generic<Integer>(12);
		g1.show();
		System.out.println(g1.get());
		
		g2.show();
		System.out.println(g2.get());
	}

}
