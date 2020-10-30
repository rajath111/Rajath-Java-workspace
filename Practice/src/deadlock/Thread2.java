package deadlock;

public class Thread2 {
	public synchronized void m2(Thread1 a) {
		System.out.println("I am m2 method");
		a.display1();
	}
	public synchronized void display2() {
		System.out.println("I am display 2 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2= new Thread2();
		Thread1 t1 = new Thread1(t2);
		t1.start();
		t2.m2(t1);
	}

}
