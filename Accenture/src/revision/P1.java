package revision;
import java.util.Scanner;
import static java.lang.System.*;
 import static java.lang.Math.sqrt;
import java.lang.Math.*;

//For explaining implicit and explicit type casting
class Parent{
	void print() {
		System.out.println("I am parent");
	}
}

class Child extends Parent{
	void print() {
		System.out.println("I am child");
	}
}


//For explaining type casting
class Vehicle{
	public static void type() {
		System.out.println("I am a Vehicle");
	}
	
	public void description() {
		System.out.println("I can have multiple wheels!!");
	}
}
class Car extends Vehicle{
	public static void type() {
		System.out.println("I am a Car");
	}
	
	public void description() {
		System.out.println("I can have 4 wheels!!");
	}
}

public class P1 {
	
	public static void addA(double[] nums) {
		double sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println("Executing array method!");
		System.out.println("The sum is : "+sum);
	}
	
	
	public static void addV(double...nums) {
		double sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
		}
		System.out.println("Executing vararg method!");
		System.out.println("The sum is : "+Math.round(sum));
	}
	
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		
		float num1 = 10;
		double num2 = 10;
		System.out.println("For Floating point number : "+(num1/3));
		System.out.println("For Double point number : "+(num2/3));
		//System.out.println("Enter a long number : ");
		//long num3 = Long.parseLong(sc.nextLine());
		//System.out.println(num3);
		
		addV(12,223,434,43,423,31,3);
		
		addA(new double[] {12,23,111});
		
		int n = 10;
		System.out.println(10.0/0);
		System.out.println((float)n);
		
		//Downcasting
		Object o = new Object();
		System.out.println(o instanceof Object);
		
		//String s = (String)o;
		System.out.println(String.class.getSuperclass());
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		Parent p2 = new Child();
		Child c2 = (Child)p2;
		p1.print();
		p2.print();
		c1.print();
		c2.print();
		
		out.println("Hello,baby!");
		System.out.println("Square root of 25 is : "+sqrt(25));
		
		System.gc();
		Runtime r = Runtime.getRuntime();
		r.gc();
		System.out.println(r.freeMemory());
		System.out.println(r.maxMemory());
		System.out.println(r.totalMemory());
		
		
		//Method hiding or compile time polymorfism
		Car car1 = new Car();
		Vehicle v1 = new Car();
		car1.type();
		car1.description();
		v1.type();
		v1.description();
		
		sc.close();
	}
}
