package multithreading;

public class MultiThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyRunnable r = new MyRunnable();
		//System.out.println("priority of main is : "+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(10);
		System.out.println("priority of main is : "+Thread.currentThread().getPriority());
		//sr.start();
		Thread t = new Thread(r);
		//t.setPriority(1);
		t.start();                  //----> Only main thread
		//----------------------->main thread + child thread
		//this causes the main to join at the end of thread t
		Thread.sleep(5000);
		t.interrupt();
		for(int i=0;i<10;i++)
			System.out.println("This is Main thread iteration "+(i+1));
		//t.start(); //Runtime Exception : java.lang.IllegalThreadStateException
	}

}
