package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R3Quantifiers {
	
	public static void main(String...strings) {
		
		String s = "ababbabaa";
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("babaabbaaaabaa");
		
		while(m.find()) {
			System.out.println(m.start() + "..." + m.group());
		}
		
	}

}
