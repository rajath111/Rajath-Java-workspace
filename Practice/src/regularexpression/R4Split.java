package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R4Split {
	
	public static void main(String...strings) {
		// Rajath is Indian
		Pattern p = Pattern.compile("[\\.@]");
		String[] str = p.split("rajath@gmail.com");
		
		for(String s:str) {
			System.out.println(s);
		}
		
	}

}
