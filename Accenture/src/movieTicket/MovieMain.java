package movieTicket;

import java.util.Scanner;
public class MovieMain 
{
	Scanner sc = new Scanner(System.in); //One variable is enough
		public static ticket getMovie_details()
		{
			Scanner sc = new Scanner(System.in); //You can remove these
			ticket t1= new ticket();
			
			System.out.println("enter the movie name:");
			t1.setMovie_name(sc.nextLine());
			
			System.out.println("enter the movie category:");
			t1.setMovie_cat(sc.nextLine());
			return t1;
			
		}
		public static  String getCircle_details()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the movie circle:");
			String s =sc.nextLine();
			return s;
		}
		
		public static void main(String[] args) {
			
			ticket t1 = new ticket();
			t1 = getMovie_details();
			String s = getCircle_details();
			int i;
			i = t1.calticket_cost(s);
			System.out.println(t1);  //This is only for reference
			System.out.println(i);   //For debugging i used this
			switch(i)
			{
			case -1:
				System.out.println("movie name is:"+t1.getMovie_name()+" category is:"+t1.getMovie_cat() );
				System.out.println("sorry this category is not avilible");
				break;
			case -2:
				System.out.println("movie name is:\n"+t1.getMovie_name()+" category is:"+t1.getMovie_cat() );
				System.out.println("sorry this circle is not avilible");
				break;
			case -3:
				System.out.println("movie name is:\n"+t1.getMovie_name()+" category is:"+t1.getMovie_cat() );
				System.out.println("invalid");
				break;
			case 0:
				System.out.println("movie name is:"+t1.getMovie_name()+" \n category is:"+t1.getMovie_cat() );
				System.out.println("the ticket price:"+t1.getMovie_cost());
				break;
				
				default:
			}
			
		
			
			
	}

}
