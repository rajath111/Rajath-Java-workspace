package sortingALgorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {

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
		mergeSort(array, 0 , num-1);
		for(int i = 0;i<num;i++)
			System.out.println(array[i]);
		sc.close();

	}

	public static void mergeSort(int[] array, int l, int h) {
		if(l==h)
			return;
		else {
			int mid = (h+l)/2;
			mergeSort(array,l,mid);
			mergeSort(array,mid+1,h);
			merge(array,l,mid,h);
		}
	}
	
	public static void merge(int array[],int l,int mid,int h) {
		int l1 = mid-l+1;
		int l2 = h-mid;
		int array1[] = new int[l1];
		int array2[] = new int[l2];
		for(int i=0;i<l1;i++)
			array1[i] = array[i+l];
		for(int i=0;i<l2;i++)
			array2[i] = array[mid+1+i];
		int i=0, j=0;
		int k = l;
		while(i<l1 && j<l2) {
			if(array1[i]>=array2[j]) {
				array[k] = array2[j];
				j++;
			}
			else {
				array[k] = array1[i];
				i++;
			}
			k++;
		}
		while(i<l1) {
			array[k] = array1[i];
			i++;
			k++;
		}
		while(j<l2) {
			array[k] = array2[j];
			j++;
			i++;
		}
	}

}
