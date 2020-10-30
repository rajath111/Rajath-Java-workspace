package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s[] = new Student[5];
		for(int i=0;i<3;i++) {
			s[i] = (Student) ois.readObject();
			System.out.println(s[i]);
		}
		fis.close();
		ois.close();
		System.out.println("END!!!!");
	}

}
