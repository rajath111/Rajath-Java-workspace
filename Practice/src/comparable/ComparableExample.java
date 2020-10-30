package comparable;

import java.util.*;
import java.io.*;

public class ComparableExample {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int num = sc.nextInt();
		sc.nextLine();
		List<Student> list = new ArrayList<Student>();
		Student []s = new Student[num];
		for(int i= 0;i<num;i++) {
			System.out.println("Enter student "+(i+1)+" name : ");
			String name = sc.nextLine();
			System.out.println("Enter the student "+(i+1)+" is : ");
			int id = sc.nextInt();
			System.out.println("Enter student "+(i+1)+" marks");
			float marks = sc.nextFloat();
			sc.nextLine();
			synchronized(sc) 
			{
			s[i] = new Student(id,name,marks);
			s[i].findGrade();
			list.add(s[i]);
			}
			System.out.println(list.get(i));
		}
		sc.close();
		//Student student = new Student();
		Collections.sort(list);
		for(int i=0;i<num;i++) {
			System.out.println(list.get(i));
		}
		/*ArrayList<String> name = new ArrayList<String>();
		name.add("Rajath");
		name.add("Indu");
		name.add("Sushu");
		name.add("Amma");
		name.add("Akka");
		name.add("Naanu");
		Collections.sort(name);
		for(String s : name)
			System.out.println(s);*/
	}

}

