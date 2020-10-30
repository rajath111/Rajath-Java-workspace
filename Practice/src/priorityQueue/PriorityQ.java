package priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<String> q = new PriorityQueue<String>(10,new MyComparator());
		System.out.println("Enter names into priority queue :");
		for(int i=0;i<10;i++) {
			q.add(sc.nextLine());
		}
		System.out.println(q);
		System.out.printf("Polling based on priority : ");
		for(int i=0;i<15;i++) {
			System.out.printf("%s ",q.poll());
		}
		sc.close();
	}

}
