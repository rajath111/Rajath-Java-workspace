//Accesssing inner class method from static area

package innerClasses;

class Outer {
	class Inner{
		public void m1() {
			System.out.println("Inner class method!");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Main method in Outer class!!");
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.m1();
	}

}
