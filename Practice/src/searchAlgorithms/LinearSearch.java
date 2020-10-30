package searchAlgorithms;//Time Complexity O(n)

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();
		int []array = new int[num];
		System.out.println("Enter the elements of the array:  ");
		for(int i=0;i<num;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter number to be searched: ");
		int key = sc.nextInt();
		System.out.printf("The position of %d is %d !!!",key,search(array,key));
		sc.close();
	}
	
	public static int search(int[] array,int key) {
		int index = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==key) {
				index = i;
				break;
			}
		}
		return index;
	}

}
