package threading;

public class SynchronizedExample{

	public static void main(String[] args) {
		System.out.println("The returned number is : "+Synchronized.getNum());

	}

};

class Synchronized{
	static int num = 110;
	public static synchronized int getNum() {
		return num;
	}
}
