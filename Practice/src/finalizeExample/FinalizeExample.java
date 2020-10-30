package finalizeExample;

public class FinalizeExample {
	static FinalizeExample s;
	int i =10;
	static int count = 0;
	public static void main(String[] args) throws InterruptedException {
		Temp t1 = new Temp();
		t1.setNum(20);
		t1 = new Temp();
		t1.finalize();//The object will not be destroyed
		System.out.println(t1.getNum());
		System.gc();
		System.out.println("End of main");
		
		//Demonstration of finalize method called only once
		
		FinalizeExample f1 = new FinalizeExample();
		f1 = null;
		
		System.gc();
		Thread.sleep(100);
		
		System.out.println("The value of i of the object, after the object got life from death "+s.i);
		s = null;
		System.gc();
		Thread.sleep(100);
		
		for(int i=0;i<1000000;i++) {
			FinalizeExample f = new FinalizeExample();
			f = null;
		}
		System.gc();
		
	}
	public void finalize() {
		count++;
		System.out.println("Finalize method called: count = "+count);
		s = this;
	}
}
