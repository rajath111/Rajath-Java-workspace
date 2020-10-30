package packageEcample;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(34));
		System.out.println(r.nextFloat()*1000);
	}

}
