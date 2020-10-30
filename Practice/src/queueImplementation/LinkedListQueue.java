package queueImplementation;

public class LinkedListQueue {
	Node head;
	
	public void enqueue(int data) {
		if(head==null) {head = new Node(data);}
		else {
		Node newNode = new Node(data);
		Node current = head;
		while(current.next!=null)
			current = current.next;
		current.next = newNode;
		}
	}
	
	public int dequeue() {
		if(head==null) {
			System.out.println("The Queue is empty!!");
			return -1;
		}
		else {
			int data = head.item;
			head = head.next;
			return data;
		}
	}
}
