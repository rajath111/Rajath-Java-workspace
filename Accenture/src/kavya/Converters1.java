package kavya;

import java.util.*;
public class Converters1 {
String dbinary="";
String doctal="";
String dhexa="";
Scanner sc=new Scanner(System.in);
    
int m=sc.nextInt();
	int m1=m;
	int m2=m;
	public void decimalToBinary()
	{
		while(m>0)
		{
			int r=m%2;
			m=m/2;
			
			dbinary=r+dbinary;
		}
		

	}
	
	  public void decimalToOctal()
	 {
		 while(m1>0)
			{
				int r=m1%8;
				m1=m1/8;
				
				doctal=r+doctal;
			}
		
		}
	 
	final public void decimlToHexa()
	 {
		 
			while(m2>0)
			{
				int r=m2%16;
				m2=m2/16;
				
				dhexa=r+dhexa;
				
				if(dhexa=="10")
				dhexa="A";
				
				else if(dhexa=="11")
					dhexa="B";
				else if(dhexa=="12")
					dhexa="C";
				else if(dhexa=="13")
					dhexa="D";
				else if(dhexa=="14")
					dhexa="E";
				else if(dhexa=="15")
					dhexa="F";
				
					
			}
	 }
	 
	 
	 public void disp1()
	 {
		 
		 decimalToBinary();
		 decimalToOctal();
		 decimlToHexa();
		System.out.println("the binary equvalent of decimal is: "+dbinary);
		System.out.println("the octal equvalent of decimal is: "+doctal);
		System.out.println("the hexa equvalent of decimal is: "+dhexa);
	 }
	 
}
	 
	 

