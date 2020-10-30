package module1;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Scanner;

public class Myreg {
	public static void regressor(ArrayList<Float> xlist, ArrayList<Float> ylist,int num) {
		float y=0, x=0;
		float w1 = (float)0.5;
		y = 30000 + w1*x;            // y = w0 + w1*x1 + w2*x2 + w3*x3 .. . .. . wn*xn
		//System.out.println("size is :"+xlist.size());
		for(int i=0;i<num;i++) {
			for(int j=0;j<xlist.size();j++) {
				float temp = 39000 + w1*xlist.get(j);
				w1 = (float)(w1 + 0.001*(ylist.get(j)-temp)*xlist.get(j));
			}
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		float year = sc.nextFloat();
		System.out.printf("The salary at age %f is : %f",year,(30000+w1*year));
	}
}
