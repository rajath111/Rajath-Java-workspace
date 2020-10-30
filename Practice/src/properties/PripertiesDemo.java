package properties;

import java.io.*;
import java.util.*;

public class PripertiesDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Properties p = new Properties();
		FileOutputStream file = new FileOutputStream("Config.properties");
		
		String str1 = "Rajath";
		System.out.println("Enter the userName : ");
		String uname = sc.nextLine();
		
		System.out.println("Enter the password : ");
		String pw = sc.nextLine();
		
		System.out.println("Enter your nick name : ");
		String nick = sc.nextLine();
		
		p.setProperty("userName", str1);
		p.setProperty("password", pw);
		p.setProperty("nickName", nick);
		p.setProperty("userName", uname);
		
		p.store(file, "Configured by Rajath");
	}

}
