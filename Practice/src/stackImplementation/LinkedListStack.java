package stackImplementation;

public class LinkedListStack {
	Node head;
	public void push(int data) {
		if(head==null)
			head = new Node(data);
		else {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
	}
	public int pop() {
		if(head==null)
			return -1;
		else {
			int data = head.item;
			head = head.next;
			return data;
		}
	}
	public int peek() {
		if(head==null)
			return -1;
		else {
			return head.item;
			
		}
	}
}
