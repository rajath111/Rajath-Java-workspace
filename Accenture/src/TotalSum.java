import java.util.Scanner;
public class TotalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter the end numberr :");
		int end = sc.nextInt();
		int sum = 0;
		int len = end-start+1;
		for(int i=0;i<len;i++) {
			sum += start;
			start++;
		}
		System.out.println("The sum is : { "+sum+" }");
	}

}
