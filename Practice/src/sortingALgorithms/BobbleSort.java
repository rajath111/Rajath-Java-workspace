package sortingALgorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BobbleSort  implements Cloneable{
 
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
		bobbleSort(array);
		for(int i = 0;i<num;i++)
			System.out.println(array[i]);
		sc.close();
	}

	protected static void bobbleSort(int[] array) {
		int n = array.length;
		int swap = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(array[j]>array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	}

}
