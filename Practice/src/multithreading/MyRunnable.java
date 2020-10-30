package multithreading;



class MyRunnable implements Runnable{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("I am lazy thread");
			}
			System.out.println("Runnable Thread / Child Thread");
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("At last, interrupt occured!!");
		}
	}
}
