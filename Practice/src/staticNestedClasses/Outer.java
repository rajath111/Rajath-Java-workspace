package staticNestedClasses;

class Outer {
	static class Nested {
		static int count = 0;
		
		Nested(){
			count++;
			System.out.println("Nested class "+count+" createdd!");
		}
		void m1() {
			System.out.println("Inside static nested class!!");
		}
		public static void main(String...strings) {
			System.out.println("Ststic Nested class main method!!");
		}
	};
	
	public static void main(String...strings) {
		
		Nested n = new Nested();
		n.m1();
	}
}
