package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle3 {
	public static void main(String []args) throws IOException {
		FileOutputStream fw = new FileOutputStream("text3.txt");
		fw.write(998);
		fw.write(101);
		fw.close();
		System.out.println("File has been written");
		FileInputStream fr = new FileInputStream("text3.txt");
		System.out.println(fr.readAllBytes());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());fr.readAllBytes();
		fr.close();
	}
}
