package multithreading;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
			System.out.println("No-arg run method");
			Thread.yield();
		}
			System.out.println("This My thread is executed by : "+Thread.currentThread().getName());
	}
	public void run(int i) {
		System.out.println("Int-arg run method");
	}
}
