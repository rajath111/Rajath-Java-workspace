package basics;

import java.util.Scanner;

public class Switch {
	public static void addTwo(int a, int b) {
		System.out.println("Welcome to "+"Addition");
		System.out.println("Sum id : "+(a+b));
		System.out.println("''''''''''''''''''''''''");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int noOfYears = 10;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter two numbers :");
			int x = sc.nextInt();
			int y = sc.nextInt();
			addTwo(10,11);
			}
		
		
		
		String dayName = sc.nextLine();
		
		dayName = dayName.toLowerCase();
		
		switch(dayName) {
		case "mon":
			System.out.println("It's Monday, not happy!!");
			break;
			
		case "tue":
			System.out.println("Ok, it's Tuesday, not so bad!!");
			break;
			
		case "sat":
			System.out.println("It's weekend, time for the party");
			break;
			
		case "sun":
			System.out.println("Day to rest, from tomorrow the work starts!!");
			break;
			
		default:
			System.out.println("It's a normal day");
		}
	}

}
