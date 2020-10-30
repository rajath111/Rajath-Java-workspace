package sortingALgorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuickSort {
	public static void quickSort(int[] A, int start, int end) {
		if(start<end) {
			System.out.println(Arrays.toString(A));
			int q = partition(A,start,end);
			quickSort(A,start,q-1);
			quickSort(A,q+1,end);
		}	
	}
	public static int partition(int[] A, int p,int r) {
		int x = A[r];
		int i = p-1;
		int temp = 0;
		for(int j=p;j<r;j++) {
			if(A[j]<=x) {
				i = i+1;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		return i+1;
	}
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
		quickSort(array, 0 , num-1);
		for(int i = 0;i<num;i++)
			System.out.println(array[i]);
		sc.close();

	}

}
