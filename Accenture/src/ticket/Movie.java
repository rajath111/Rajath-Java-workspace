package ticket;

public class Movie
{
    private String movieName;
    private String movieCategory;
    private int ticketCost;
    
    public void setMovieName(String s){
        movieName =s;
    }
    public void setMovieCategory(String s){
        movieCategory=s;
    }
    public void setTicketCost(int i){
        ticketCost=i;
    }
    
    public String getMovieName(){return movieName;}
    public String getMovieCategory(){return movieCategory;}
    public int getTicketCost(){return ticketCost;}
    
    public int calculateTicketCost(String circle)
    {
        if((!(circle.toLowerCase().equals("gold") || circle.toLowerCase().equals("silver")) && !(movieCategory.toLowerCase().equals("2d") || movieCategory.toLowerCase().equals("3d"))))
        return -3;
        else if(!(circle.toLowerCase().equals("gold") || circle.toLowerCase().equals("silver")))
        return -2;
        else if(!(movieCategory.toLowerCase().equals("2d") || movieCategory.toLowerCase().equals("3d")))
        return -1;
        else{
            if(circle.toLowerCase().equals("gold") && movieCategory.toLowerCase().equals("2d"))
            ticketCost=300;
            else if(circle.toLowerCase().equals("gold") && movieCategory.toLowerCase().equals("3d"))
            ticketCost=500;
            else if(circle.toLowerCase().equals("silver") && movieCategory.toLowerCase().equals("2d"))
            ticketCost=250;
            else if(circle.toLowerCase().equals("silver") && movieCategory.toLowerCase().equals("3d"))
            ticketCost=450;
        }
        return 0;
    }
}