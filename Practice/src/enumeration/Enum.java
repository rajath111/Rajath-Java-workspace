package enumeration;

enum Days{
	Mon,Tue,Wed,Thu,Fri,Sat,Sun;
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days d = Days.Mon;
		System.out.println(d);
		
		Days array[] = Days.values(); 
		
		for(Days p : array) {
			System.out.println("The enum value is : "+p);
			System.out.print("The day is ");
			switch(d) {
			case Mon:{ System.out.println("Monday");
						System.out.println("The ordinal is : "+p.ordinal());
						break;}
			case Wed:{ System.out.println("Wednesday");
			System.out.println("The ordinal is : "+p.ordinal());
			break;}
			case Tue:{ System.out.println("Tuesday");
			System.out.println("The ordinal is : "+p.ordinal());
			break;}
			case Thu: System.out.println("Thursday");
			System.out.println("The ordinal is : "+p.ordinal());
			break;
			case Fri: System.out.println("Friday");
			System.out.println("The ordinal is : "+p.ordinal());
			break;
			case Sat: System.out.println("Saturday");
			System.out.println("The ordinal is : "+p.ordinal());
			break;
			case Sun: System.out.println("Sunday");
			System.out.println("The ordinal is : "+p.ordinal());
			}
			int q = 10;
			int r = 0x10;
			int s = 010;
			int t = 0b10;
			System.out.println("Decimal 10 : "+q);
			System.out.println("Hexadecimal 10 : "+r);
			System.out.println("Octal 10 : "+s);
			System.out.println("Binary 10 : "+t);
			
			String str = "Rajath";
			System.out.println(str.substring(0 ,str.length()));
		}
	}

}
