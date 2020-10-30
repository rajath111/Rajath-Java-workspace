package module1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to income calculator");
		File file1 = new File("salary.txt");
		Scanner sc = new Scanner(file1);
		ArrayList<Float> x = new ArrayList<Float>();
		ArrayList<Float> y = new ArrayList<Float>();
		while(sc.hasNext()) {
			String entry[] = sc.nextLine().split(",");
			x.add(Float.parseFloat(entry[0]));
			y.add(Float.parseFloat(entry[1]));
			//System.out.printf("x = %f and y = %f",x,y);
			
		}
		Myreg.regressor(x,y,10);
	}

}
