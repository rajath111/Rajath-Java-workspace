package queueImplementation;

public class QueueExample {
	public static void main(String...strings) {
		ArrayQueue queue = new ArrayQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(300);
		queue.enqueue(1928);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
		System.out.println("\n\n\n***************************************************************\n\n\n************************************");
		
		LinkedListQueue queue1 = new LinkedListQueue();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.enqueue(300);
		queue1.enqueue(1928);
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
	}
}
