package movieTicket;

public class ticket {
	private String movie_name;  // Use : private String movieName;
								   // Automatically it will be assigned to default value
	private  String movie_cat;
	private int movie_cost;
	
	public String getMovie_name() {  // Use : getMovieName()
									 // Standard format
		return movie_name;
	}
	public void setMovie_name(String name) {
		movie_name = name;
	}
	public String getMovie_cat() {
		return movie_cat;
	}
	public void setMovie_cat(String cat) {
	movie_cat = cat;
	}
	public int getMovie_cost() {
		return movie_cost;
	}
	public void setMovie_cost(int cost) {
		movie_cost = cost;
	}
	
	public int calticket_cost(String circle)
	{
		
		
		     //Kopa bandide!!!!!, you are comparing everything with empty string
		int cost = 0;
		if(!(movie_cat.equals("2d") || movie_cat.equals("3d")))   //For string comparison syntax is
																  // str1.equals(str2)
			return -1;
		else if(!(circle.equals("gold") || circle.equals("silver")))
			return -2;
		else if(!( movie_cat.equals("2d") || movie_cat.equals("3d") && circle.equals("gold") || circle.equals("silver")))
			return -3;
	
		 else
		 {
			 //moved int cost = 0; outside if condition to make it visible
		
		if(circle.equals("gold") && movie_cat.equals("2d"))
			 cost = 300;
		else if(circle.equals("gold") && movie_cat.equals("3d"))
			 cost = 500;
		else if(circle.equals("silver") && movie_cat.equals("2d"))
			cost = 250;
		else if(circle.equals("silver") && movie_cat.equals("3d"))
			cost = 450;
	
		 }
		 return cost;      //Return the calculated cost
	}
	
	public String toString() {   //Special method to print objects
		String str = "Movie name : " + movie_name + "\nCategory : " + movie_cat + "\nMovie Circle : "+"Dono";
		return str;
		
	}
}
