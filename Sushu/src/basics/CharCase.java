package basics;

import java.util.Scanner;

public class CharCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		for(int i=0;i<10;i++) {
		System.out.println("Enter a Character :");
		ch = sc.next().charAt(0);
		
		/*
		sc.nextInt();       1
		sc.nextFloat();     12.6
		sc.nextDouble();    1237.173847737
		sc.nextLong();     1828383727387838
		sc.next();         "sushu" " rajath"
		sc.nextLine();     "Sushmitha E S"
		
		sc.next().charAt(0); 'a'
		*/
		
		if(ch>='a' && ch<='z') {
			System.out.println(ch+ ", is a lower case");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+ ", is a Upper case" );
		}
		else if(ch>='0' && ch<='9' )
		{
			System.out.println(ch+ ", is a number");
		}
	
		else
		{
			System.out.println(ch+ ", is  a Special Character"
					+ "" );	
		}
		}
	
	}

}
