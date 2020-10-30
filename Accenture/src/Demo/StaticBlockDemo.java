package Demo;

public class StaticBlockDemo {
	static int num;
	static int area;
	static {
		System.out.println("Static block executed!!!");
		num = 100;
		area = 10;
	}
	public static int area() {
		return area*area;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		System.out.println(area());
		String s = String.valueOf(area);
		System.out.println(s);
		double j = 10.5;
		System.out.println(0.0/0);
		String s1 = new String();
		Object o = j;
		System.out.println(o instanceof String);
		System.out.println(4&5);
		System.out.println(4|5);
		System.out.println(4^5);
		System.out.println(~7);
		System.out.println("~~~~~~~~~~~~~~~~~`````````````````~~~~~~~~~~~~~~~~");
		int i = 10;
		System.out.println((i++)+" "+(i--)+" "+(i++));
		
		//Object obj = Class.forName(args[0]).newInstance();
		//System.out.println("The created class name : "+obj.getClass().getName());
	}

};
class Student{
	public static void main(String...strings) {
		System.out.println("Class Student!!!");
	}
};
class Demo{
	public static void main(String...strings) {
		System.out.println("Nothing");
	}
};
