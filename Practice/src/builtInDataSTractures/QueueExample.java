package builtInDataSTractures;

import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(15);
		q.add(100);
		System.out.println(q);
		q.add(200);
		System.out.println(q);
		q.add(300);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.add(400);
		System.out.println(q);
		q.add(500);
		System.out.println(q);
		q.add(600);
		System.out.println(q);
		q.add(700);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println("The number at head is :"+q.peek());
		System.out.println(q);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		/*q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);
		q.add(100);*/
		System.out.println(q);
	}

}
