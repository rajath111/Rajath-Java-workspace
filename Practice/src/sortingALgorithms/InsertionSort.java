package sortingALgorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
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
		insertionSort(array);
		for(int i = 0;i<num;i++)
			System.out.println(array[i]);
		sc.close();

	}

	public static void insertionSort(int[] array) {
		int n = array.length;
		for(int i=1;i<n;i++) {
			int item = array[i];
			int j = i;
			while(j>0 && array[j-1]>item) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = item;
		}
	}

}
