package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle1 {

	public static void main(String[] args) throws IOException {
		File file = new File("text1.txt");
		try {
		if(!file.exists())
			file.createNewFile();
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		//Writing into a file
		
		FileWriter fw = new FileWriter("text1.txt");
		fw.write("My name is rajath\n");
		fw.write("I am an indian");
		fw.close();
		//File f2 = new File("text1.txt");
		//f2.createNewFile();
		FileWriter fw1 = new FileWriter("text2.txt");
		fw1.append("My name is rajath\n");
		fw1.append("I am an indian\n");
		fw1.append("I am from tumkur, karnataka\n");
		fw1.close();
		System.out.println("FIles were written!!!");

	}

}
