package staticinstanceConyrolflow;

public class Derrived extends Base{
	static int i = 20;
	static {
		System.out.println("First static blockk in Derrived");
		System.out.println("Value of i in Derrived is : "+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derrived d = new Derrived();
		
	}
	static{
		System.out.println("Second static block in derrived");
	}

	{
		System.out.println("Only one instance block in Derrived");
	}
}
