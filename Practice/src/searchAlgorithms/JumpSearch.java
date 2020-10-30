package searchAlgorithms;//Time Complexity O(sqrt(n))

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JumpSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();
		int []array = new int[num];
		System.out.println("Enter the elements of the array:  ");
		List<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<num;i++) {
			array[i] = sc.nextInt();
			list.add(array[i]);
		}
		Collections.sort(list);
		for(int i=0;i<num;i++) {
			array[i]  = list.get(i);
			System.out.println(array[i]);
		}
		System.out.println("Enter number to be searched: ");
		int key = sc.nextInt();
		System.out.printf("The position of %d is %d !!!",key,jumpSearch(array,key));
		sc.close();

	}

	public static int jumpSearch(int[] array, int key) {
		int n = array.length;
		int m = (int)Math.sqrt(n);
		int prev = 0;
		while(array[Math.min(m,n-1)]<key) {
			prev = m;
			m = m + (int)Math.sqrt(n);
		}
		while(prev<Math.min(m, n-1)) {
			if(array[prev] == key)
				return prev;
			prev++;
		}
		return -1;
	}

}
