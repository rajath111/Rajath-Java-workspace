package fileHandling;

import java.util.Scanner;
import java.io.*;

public class StudentManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int num = sc.nextInt();
		sc.nextLine();
		Student []s = new Student[num];
		for(int i= 0;i<num;i++) {
			System.out.println("Enter student "+(i+1)+" name : ");
			String name = sc.nextLine();
			System.out.println("Enter the student "+(i+1)+" is : ");
			int id = sc.nextInt();
			System.out.println("Enter student "+(i+1)+" marks");
			float marks = sc.nextFloat();
			sc.nextLine();
			s[i] = new Student(id,name,marks);
			s[i].findGrade();
		}
		Student rec[] = new Student[num]; 
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(int i=0;i<num;i++) {
			oos.writeObject(s[i]);
			System.out.println("Object "+(i+1)+" Serialized");
		}
		fos.close();
		oos.close();
	}

}
 