package regularexpression;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R5File {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		File file = new File("c:\\Desktop\\regDemo");
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("Hello");
		}
		
		// PrintWriter out = new PrintWriter("c:\\Desktop\\regDemo\\input.txt");
		FileWriter writer = new FileWriter("c:\\Desktop\\regDemo\\input.txt", true);
		BufferedWriter out = new BufferedWriter(writer);
		
		for(int i=0;i<5;i++) {
			
		System.out.println("Enter your details");
		String details = sc.nextLine();
		out.write(details + "\n");
		}
		
		out.flush();
		out.close();
	}

}
