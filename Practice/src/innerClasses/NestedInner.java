package innerClasses;

public class NestedInner {
	class Inner1{
		void m2() {
			System.out.println("Inner class method!!!");
		}
		
		class Inner2{
			void m1() {
				System.out.println("Inner most class method!");
			}
		}
	}
	void m3() {
		System.out.println("Outer class method!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NestedInner n = new NestedInner();
		n.m3();
		
		NestedInner.Inner1 i1 = n.new Inner1();
		i1.m2();
		
		NestedInner.Inner1.Inner2 i2 = i1.new Inner2();
		i2.m1();
		
		//or
		
		new NestedInner().new Inner1(). new Inner2().m1();
	}

}
