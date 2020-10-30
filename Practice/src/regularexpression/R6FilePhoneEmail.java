package regularexpression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R6FilePhoneEmail {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		File file = new File("c:\\Desktop\\regDemo");
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("Directory Created");
		}
		
		FileReader reader = new FileReader("c:\\Desktop\\regDemo\\input.txt");
		BufferedReader in = new BufferedReader(reader);
		
//		FileWriter writer = new FileWriter("output.txt");
//		BufferedWriter out = new BufferedWriter(writer);
	
		PrintWriter out = new PrintWriter("c:\\Desktop\\regDemo\\output.txt");
		out.println("Email Ids : ");
		
		Pattern p = Pattern.compile("([a-zA-Z0-9][a-zA-Z0-9._]*)@([a-zA-Z0-9]+)([.][a-zA-Z]+)+");
		
		String line = in.readLine();
		
		while(line!=null) {
			Matcher m = p.matcher(line);
			while(m.find()) {
				out.println(m.group());
				System.out.println(">>> : " + m.group());
				System.out.println("Group 1 : " + m.group(1));
				System.out.println("Group 2 : " + m.group(2));
				System.out.println("Group 3 : " + m.group(3));
			}
			line = in.readLine();
		}
		out.flush();
		out.close();
	}

}





