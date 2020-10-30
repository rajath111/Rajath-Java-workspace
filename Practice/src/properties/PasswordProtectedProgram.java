package properties;

import java.util.*;
import java.io.*;

public class PasswordProtectedProgram {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Properties p = new Properties();

		FileInputStream file = new FileInputStream("config.properties");

		p.load(file);

		System.out.println("Enter your userName : ");
		String name = sc.nextLine();
		if (name.equals(p.getProperty("userName"))) {
			System.out.println("Enter your password : ");
		} else {
			System.out.println("Sorry!!! you have not registered. Register and try again....");
			System.exit(0);
		}
		String pw = sc.nextLine();
		int count = 0;
		while (count < 4) {
			if (pw.equals(p.getProperty("password"))) {
				System.out.println("Hi '" + p.getProperty("nickName") + "', Welcome to our services.");
				break;
			} else {
				System.out.println("Incorrect Password, enter again!!");
				System.out.println((4-count-1)+" chance(s) left");
			}
		}
		System.out.println("Now let's do Addition");
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum of two numbers is "+(a+b));
		sc.close();
	}

}
