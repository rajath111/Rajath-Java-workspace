package staticinstanceConyrolflow;

import java.io.IOException;
import java.lang.ArithmeticException;
public class Base {
	static int i = 30;
	static {
		System.out.println("I am base static block 1");

		System.out.println("Value of i in Base is : "+i);
	}
	{
		System.out.println("I am first instance block in Base");
	}
	Base(){
		System.out.println("The number is "+i);
	}
	public static void m1(int i) {
		System.out.println("I am m1 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Base b = new Base();
		try {
			System.out.println("Hello");
		}
		catch(ArithmeticException e) {
			
		}
		m1(2);
	}
	static {
		System.out.println("I am base ststic block 2");
	}
	public void m1() {
		System.out.println("The number j is : "+j);
	}
	public static int j = 20;
	{
		System.out.println("I am second instance block in Base");
	}
}
