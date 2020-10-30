package basics;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sushu = new Scanner(System.in);
		Scanner sc = sushu;
		
		System.out.println("Enter three numbres :");
		int x = sc.nextInt();
		int y = sushu.nextInt();
		int z = sc.nextInt();
		
		int min = x<y ? x<z ? x : z :y<z ? y : z;
		
		System.out.println("The maximum number is "+min);
		
		/*System.out.println("Enter 10 numbers :");
		int array[] = new int[10];
		int max = 0;
		for(int i=0;i<10;i++) {
			
			array[i] = sc.nextInt();
			if (array[i] > max) {
				max = array[i];	
			}
		}
		System.out.println("The max of 10 numbers is : "+max);*/
	}

}
