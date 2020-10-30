package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandle2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("text2.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		sc.close();
		
	}

}
