package linkedLists;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertBegin(10);
		list.insertBegin(11);
		list.insertBegin(100);
		list.insertEnd(23);
		list.insertBegin(19);
		list.insertMid(12);
		list.insertMid(13);
		list.dislpay();
		System.out.println("Position of 23 is : "+list.search(23));
		list.delete(13);
		list.dislpay();
		list.sort();
		list.dislpay();
		System.out.println("Position of 23 is : "+list.search(23));
	}

}