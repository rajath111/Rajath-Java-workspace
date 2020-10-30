package interthreadcommunication;

public class ThreadA extends Thread{
	public int sum = 0;
	public synchronized void run() {
		sum = 10;
		for(int i=0;i<=100;i++)
			sum = sum + i;
		System.out.println(sum);
		this.notify();
	}
}
