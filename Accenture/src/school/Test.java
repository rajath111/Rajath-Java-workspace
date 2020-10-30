package school;

import java.util.*;
public class Test{
	
	
    public static HashMap<String,ArrayList<String>> retrieveStudentInfo(ArrayList<Student> al) {
       // implement the required business logic
       TreeSet<String> set = new TreeSet<String>();
       for(int i=0;i<al.size();i++){
           set.add(al.get(i).getSchoolName());
       }    	    	
       
       Iterator<String> itr = set.iterator();
       HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
       
       while(itr.hasNext()) {
    	   String school = (String)itr.next();
    	   ArrayList<String> temp = new ArrayList<String>();
    	   for(int i=0;i<al.size();i++) {
    		   if(al.get(i).getSchoolName().equals(school)) {
    			   temp.add(al.get(i).getStudName());
    		   }
    	   }
    	   hm.put(school,temp);
       }
    System.out.println(hm);
	return hm;
    }
    
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setStudId(1);
        s1.setStudName("John");
        s1.setSchoolName("ZEE");
        Student s2=new Student();
        s2.setStudId(2);
        s2.setStudName("Tom");
        s2.setSchoolName("ZEE");
        Student s3=new Student();
        s3.setStudId(3);
        s3.setStudName("Peter");
        s3.setSchoolName("BEE");
        Student s4=new Student();
        s4.setStudId(4);
        s4.setStudName("Rose");
        s4.setSchoolName("OX-FO");
        Student s5=new Student();
        s5.setStudId(5);
        s5.setStudName("Alice");
        s5.setSchoolName("ZEE");
       
       //invoke the retrieveStudentInfo method and display the result
       ArrayList<Student> a=new ArrayList<Student>();
       a.add(s1);
       a.add(s2);
       a.add(s3);
       a.add(s4);
       a.add(s5);
       HashMap hm=retrieveStudentInfo(a);
    }
    
    
}