package innerClasses;

public class AnonymousInnerClassAsArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multithreading using single class
		//Creating Anonymous class as argument
		
		System.out.println("Start of main!!");
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++)
					System.out.println("Thread 1");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		
		
		new Thread(new Runnable() {
			public void run() {
				for(int i =0;i<10;i++)
					System.out.println("Thread 2");
			}
		}).start();
		
		for(int i=0;i<10;i++)
			System.out.println("Main thread");
		
		System.out.println("End of main!!");
	}

}
