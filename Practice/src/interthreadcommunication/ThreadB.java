package interthreadcommunication;

public class ThreadB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadA ta = new ThreadA();
		ta.start();
		//ta.wait();
		//Thread.sleep(1);
		ta.join();
		System.out.println("The sum is : "+ta.sum);
	}

}
