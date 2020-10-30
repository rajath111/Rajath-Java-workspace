package ticket;

import java.util.Scanner;
public class Main
{
    public static Scanner sc=new Scanner(System.in);
    
    public static Movie getMovieDetails()
    {
        Movie m=new Movie();
        System.out.println("Enter the movie name:");
        m.setMovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        m.setMovieCategory(sc.nextLine());
        return m;
    }
    
    public static String getCircle(){
        System.out.println("Enter the circle:");
        String str=sc.nextLine();
        return str;
    }
    
    public static void main (String[] args) {
       
        Movie m=new Movie();
        m=getMovieDetails();
        String s=getCircle();
        int i=m.calculateTicketCost(s);
        switch(i)
        {
            case -1:
                System.out.println("Movie name = "+m.getMovieName());
                System.out.println("Movie category = "+m.getMovieCategory());
                System.out.println("Sorry there is no "+m.getMovieCategory()+" type of category in theater.");
                break;
            case -2:
                System.out.println("Movie name = "+m.getMovieName());
                System.out.println("Movie category = "+m.getMovieCategory());
                System.out.println("Sorry!!! Circle is Invalid.");
                break;
            case -3:
                System.out.println("Movie name = "+m.getMovieName());
                System.out.println("Movie category = "+m.getMovieCategory());
                System.out.println("Sorry!!! Both circle and category are Invalid.");
                break;
            case 0:
                System.out.println("Movie name = "+m.getMovieName());
                System.out.println("Movie category = "+m.getMovieCategory());
                System.out.println("The ticket cost is = "+m.getTicketCost());
                break;
            default:
        }
        sc.close();
    }
}