package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R2Basic2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mail id : ");
		String input = sc.nextLine();
		
		// rajathes.1rn16ec105@gmail.com
		// [A-Za-z0-9][A-Za-z0-9._]+@[a-zA-Z0-9]([.][a-zA-Z]+)+
		Pattern p = Pattern.compile("[A-Za-z0-9][A-Za-z0-9._]+@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m = p.matcher(input);
		
		if(m.find() && m.group().equals(input)) {
			
			System.out.println("Valid mail id : " + m.group());
		}
		else {
			System.out.println("Invalid mail id : " + input);
		}
	}

}
