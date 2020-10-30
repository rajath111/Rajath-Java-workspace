package multithreading;

public class ThreadYeildDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++)
			System.out.println("I am in main");
	}

}
