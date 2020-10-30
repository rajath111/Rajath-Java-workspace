import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class concurrentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> l1 = new ArrayList();
		l1.add('A');
		l1.add('B');
		
		l1.add('C');
		
		CopyOnWriteArrayList<Character> l2 = new CopyOnWriteArrayList<Character>();
		l2.add('A');
		l2.add('D');
		l2.add('A');
		
		l2.addIfAbsent('A');
		System.out.println("l2 is : "+l2);
		
		System.out.println("l1 is : "+l1);
		
		l2.addAllAbsent(l1);
		
		System.out.println("l2 after adding : "+l2);
		
		
	}

}
