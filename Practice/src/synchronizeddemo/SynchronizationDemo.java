package synchronizeddemo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
		
		MyThread t1 = new MyThread(d,"Rajath");
		MyThread t2 = new MyThread(d,"Sonu");
		MyThread t3 = new MyThread(d,"Kavya");
		MyThread t4 = new MyThread(d,"Indu");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
