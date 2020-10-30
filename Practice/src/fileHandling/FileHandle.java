package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text1.txt");
		try {
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File name : "+file.getName());
			System.out.println("File path : "+file.getAbsolutePath());
			System.out.println("File can write : "+file.canWrite());
			System.out.println("File can read : "+file.canWrite());
			file.delete();
			System.out.println("Does file exista after deleting : "+file.exists());
			} 
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
		
}

