package searchAlgorithms;//Time Complexity O(log(n))

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] array, int key) {
		int left = 0;
		int right = array.length - 1;
		while(left<=right) {
			int mid = (left + right)/2;
			if(array[mid] == key)
				return mid;
			else if(key < array[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}

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
		System.out.printf("The position of %d is %d !!!",key,binarySearch(array,key));
		sc.close();
	}

}
