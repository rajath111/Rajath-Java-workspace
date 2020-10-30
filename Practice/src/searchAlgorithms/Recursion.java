package searchAlgorithms;

import java.util.Scanner;

public class Recursion {
	public static int factorial(int n) {
		if(n<=1)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int factorial = factorial(num);
		System.out.printf("The factorial of %d is %d",num,factorial);
		sc.close();

	}

}
