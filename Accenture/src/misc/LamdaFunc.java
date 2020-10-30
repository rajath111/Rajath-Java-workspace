package misc;

@FunctionalInterface
interface Adder{
	int add(int a, int b);
}

public class LamdaFunc {
	public static void main(String...strings) {
		
		Adder add = (int a, int b)->{return a+b;};
		System.out.println("the sum is : "+add.add(19,28));
			
		}
	}

