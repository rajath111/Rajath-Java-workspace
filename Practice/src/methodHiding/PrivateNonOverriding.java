package methodHiding;

class Parent1{
	public void outer() {
		display();
	}
	private void display() {
		System.out.println("I am parent!");
	}
}
class Child1 extends Parent1{
	public int display() {//display() return type has been changed
		System.out.println("I waas called in Child!");
		return 1;
	}
}

public class PrivateNonOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c =new Child1();
		c.outer();
		c.display();
	}

}
