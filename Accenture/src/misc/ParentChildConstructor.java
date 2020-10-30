package misc;

class Parent {
	Parent(){
		System.out.println("I am parent!!! "+this.hashCode());
	}
	public int getInfo() {
		return 1;
	}
};

class Child extends Parent{
	Child(){
		System.out.println("I am child!! "+this.hashCode());
		System.out.println("The object name is "+this.getClass());
	}
	public int getInfo(){
		System.out.println("This getInfo() is from Child");
		return 10;
	}
	public void display() {
		System.out.println("My name is Rajath!!");
	}
};

public class ParentChildConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c1 = new Child();
		System.out.println("Hash code of child is : "+c1.hashCode());
		System.out.println(c1.getInfo());
		Child c =(Child) c1;
		c.display();
	}

}
