package generics;

class Demo<X extends Thread & Runnable>{
	Thread getThread(X x) {
		if(x instanceof Thread) {
			return x;
		}
		else if(x instanceof Runnable){
			return new Thread(x);
		}
		return null;
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread();
		Demo d = new Demo();
		System.out.println(d.getThread(thread1));
		
		Runnable r = new Runnable() {
			public void run() {
			
			}
		};
		System.out.println(d.getThread(null));
	}
}
