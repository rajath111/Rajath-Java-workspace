package synchronizeddemo;

public class MyThread extends Thread {
	Display d;
	String s;
	
	MyThread(Display d, String s){
		this.d = d;
		this.s = s;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			d.wish(s);
			/*try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}*/
		}
	}
}
