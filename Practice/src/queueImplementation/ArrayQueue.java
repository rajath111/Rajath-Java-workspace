package queueImplementation;

public class ArrayQueue {
	static int max = 100;
	int array[] = new int[max];
	int rear = 0;
	int front = 0;
	
	public boolean isEmpty() {
		return rear==front;
	}
	
	public void enqueue(int data) {
		if(rear==max-1) {
			System.out.println("Queue is full!!");
		}
		else {
			array[rear] = data;
			rear++;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return 0;
		}
		else {
			int data = array[front];
			front++;
			return data;
		}
	}
}
