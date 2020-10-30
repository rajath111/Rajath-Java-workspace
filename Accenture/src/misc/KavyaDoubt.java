package misc;

public class KavyaDoubt {
	public static void main(String...strings) {
		Student s1 = new Student("KulliKavya",426,"RNSIT");
		Student s2 = new Student("Rajath",105,"RNSIT");
		System.out.println(s1);
		System.out.println(s2);
	}
}

class Student{
	String name;
	int id;
	String college;
	
	//Node ley kavya toString the overrise madtidini>>>>>?
	public String toString() {
		String temp = "";
		temp = "Name : "+name+"\nID : "+id+"\nCollege : "+college+"\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
		return temp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	Student(String s,int i,String c){
		name = s;
		id = i;
		college = c;
	}
}