package fileHandling;

import java.io.Serializable;

class Student implements Serializable{
	private int id;
	private String name;
	private float marks;
	private char grade;
	public static int count = 0;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public Student() {
		count ++;
	}
	public void displayDetails() {
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
		System.out.println("Grade : "+grade);
	}
	public void findGrade() {
		if(marks > 90)
			grade = 'A';
		else if(marks > 80)
			grade = 'B';
		else if(marks > 70)
			grade = 'C';
		else if(marks > 60)
			grade = 'D';
		else
			grade = 'E';
	}
	public Student(int i,String n,float m) {
		id = i;
		name = n;
		marks = m;
	}
	public String toString() {
		String s = "Id : "+id;
		s= s + "\nName : "+name;
		s = s + "\nMarks : "+marks;
		s = s + "\nGrade : "+grade;
		return s;
	}
}
