package innerClasses;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
		
		//or
		
		new Outer().new Inner().m1();
	}

}
