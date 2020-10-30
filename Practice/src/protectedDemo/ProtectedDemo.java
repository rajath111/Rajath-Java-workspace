package protectedDemo;

import sortingALgorithms.*;
import sortingALgorithms.BobbleSort;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProtectedDemo extends BobbleSort{

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
		BobbleSort b = new BobbleSort();
		b.bobbleSort(array);
		//BobbleSort b1 =(BobbleSort)b.clone();
		for(int i = 0;i<num;i++)
			System.out.println(array[i]);
		sc.close();
	}
}
