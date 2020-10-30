package runtime;

import java.util.Date;
import java.lang.Thread;

public class RuntimeFactoryObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am rajath";
		String s1 = "I am son";
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(long i=0l;i<1000000;i++) {
			for(int j=0;j<10;j++) {
			Date d = new Date();
			d = null;
			}
		}
		
		System.out.println("````````````````````````````````````````");
		//Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		System.out.println("````````````````````````````````````````````");
		
		r.gc();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		try {
		Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			
		}
	}//132663760

}
