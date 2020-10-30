package practice1;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==1 || (num>=6 && num<=20))
{
			System.out.println("its weird");
			
		}
else 
{
	System.out.println("Its not weird");
}
	} 

}
