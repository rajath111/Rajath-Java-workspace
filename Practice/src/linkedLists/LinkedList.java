package linkedLists;

public class LinkedList {
	Node head;
	
	public void insertBegin(int data) {
		Node newNode = new Node(data);
		if(head==null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void dislpay() {
		if(head==null) {
			System.out.println("No items found!!!");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.printf("%s ",current.item.toString());
			current = current.next;
		}
		System.out.printf("\n");
	}
	
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next!=null)
			current = current.next;
		current.next = newNode;
	}
	
	public void insertMid(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		int len = 0;
		Node current = head;
		while(current!=null) {
			len++;
			current = current.next;
		}
		int count = ((len%2)==0) ? len/2 : (len+1)/2;
		current = head;
		while(count>1) {
			current = current.next;
			count--;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void delete(int data) {
		Node current = head, prev = null;
		if(head==null) {
			System.out.println("Empty list, element cannot be deleted");
			return;
		}
		if(head!=null && (int)head.item==data) {
			head = head.next;
			return;
		}
		while(current!=null && (int)current.item!=data) {
			prev = current;
			current = current.next;
		}
		if(current==null)
			System.out.println("Item not present!!!");
		else {
			prev.next = current.next;
		}
	}
	public int search(int key) {
		if(head==null) {
			System.out.println("This is an empty list!!, returnedd -1");
			return -1;
		}
		int count = 0;
		Node current = head;
		while(current!=null && (int)current.item!=key) {
			current = current.next;
			count++;
		}
		if(current == null) {
			System.out.println("Key not found!!, returned -1");
			return -1;
		}
		else {
			return count;
		}
	}
	public void sort() {
		if(head == null) {
			System.out.println("Empty list, no need to sort!!");
			return;
		}
		/*int len = 0;
		Node current = head;
		while(current!=null) {
			len++;
			current = current.next;
		}*/
		Node current = head, inner = null;
		while(current!=null) {
			inner = head;
			while(inner.next!=null) {
				if((int)inner.item > (int)inner.next.item) {
					int p = (int)inner.item;
					inner.item = inner.next.item;
					inner.next.item = p;
				}
				inner = inner.next;
			}
			current = current.next;
		}
		
	}
	public void test() {
		Node current = head;
		current.item = 28;
	}
	
}
