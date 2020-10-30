package innerClasses;

public class Outer1 {
	int i = 10;
	static int j = 20;
	class Inner{
		public void m1() {
			System.out.println("Inner Class method!");
			System.out.println(i);
			System.out.println(j);
		}
	}
	
	public void m2() {
		Inner i = new Inner();
		i.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 o = new Outer1();
		o.m2();
	}

}
