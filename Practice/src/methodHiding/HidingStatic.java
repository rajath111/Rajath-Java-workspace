package methodHiding;

class Parent{
	public static void display(){
		System.out.println("I am parent");
		display1();
	}
	private static void display1() {
		System.out.println("I am private in Parent class!");
	}
};

class Child extends Parent{
	public static void display() {
		System.out.println("I am child");
		display1();
	}
	public static int display1() {
		System.out.println("I am private in Child!");
		return 1;
	}
	
}

public class HidingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c1 = new Child();
		Parent c2 = new Child();
		p.display();
		System.out.println("```````````````````````````````````````````````````````````````");
		c1.display();
		System.out.println("```````````````````````````````````````````````````````````````");
		c2.display();//Method hidiing
	}

}
