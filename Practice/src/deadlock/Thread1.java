package deadlock;

public class Thread1 extends Thread{
	Thread2 t2;
	public synchronized void m1(Thread2 b) {
		System.out.println("I am m1 method");
		b.display2();
	}
	public synchronized void display1() {
		System.out.println("I am display 1");
	}
	Thread1(Thread2 t){
		t2 = t;
	}
	public void run() {
		this.m1(t2);
	}
}
