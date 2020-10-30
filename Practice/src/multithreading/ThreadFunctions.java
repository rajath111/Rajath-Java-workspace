package multithreading;

public class ThreadFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name of MAIN thread : "+Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		System.out.println("Name of MyThread is : "+t.getName());
		System.out.println("The priority of MyThread is : "+t.getPriority());
		
		t.setName("Rajath");
		Thread.currentThread().setName("Sony");
		Thread.currentThread().setPriority(1);
		
		System.out.println("Name of the main Thread is : "+Thread.currentThread().getName());
		System.out.println("The priority of main Thread is : "+Thread.currentThread().getPriority());
		
		
		System.out.println("Name of MyThread is : "+t.getName());
		
		
		//Daemon properties
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println(t.isDaemon());
		System.out.println("Is the thread t alive : "+t.isAlive());
		//t.setDaemon(true);
		System.out.println(t.isDaemon());
		//t.start();
		System.out.println("Is the thread t alive : "+t.isAlive());
		try{Thread.sleep(4000);}
		catch(InterruptedException e) {
			
		}
		System.out.println("Is the thread t alive : "+t.isAlive());
		
		
		//Thread Grouping
		System.out.println("The group name of current thread is "+Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("The root thread group is : "+Thread.currentThread().getThreadGroup().getParent().getName());
		
		System.out.println("The group name of t is : "+t.getThreadGroup().getName());
		
		
		//Constructor for thread group
		
		ThreadGroup  g1 = new ThreadGroup("Group 1");
		System.out.println("The name of group g1 is : "+g1.getName());
		System.out.println("The name of parent of group g1 is : "+g1.getParent().getName());
		
		
		ThreadGroup g2 = new ThreadGroup(g1,"Group 2");
		System.out.println("The name of group g2 is : "+g2.getName());
		System.out.println("The name of parent of group g1 is : "+g2.getParent().getName());
		
		//Thread creation using group name
		Thread t2 = new Thread("First Thread");
		System.out.println("Thread 1 name :"+t2.getName()+" Group name :"+t2.getThreadGroup().getName());
		
		MyRunnable r = new MyRunnable();
		
		Thread t3 = new Thread(r,"Second Thread");
		System.out.println("Thread 2 name :"+t3.getName()+" Group name :"+t3.getThreadGroup().getName());
		
		Thread t4 = new Thread(g1,r,"Third Thread");
		System.out.println("Thread 3 name :"+t4.getName()+" Group name :"+t4.getThreadGroup().getName());
		
		Thread t5 = new Thread(g1,"Fourth Thread");
		System.out.println("Thread 4 name :"+t5.getName()+" Group name :"+t5.getThreadGroup().getName());
		
		//System.out.println(10/0);
	}

}
