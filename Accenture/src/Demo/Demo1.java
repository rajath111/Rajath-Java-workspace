package Demo;

public class Demo1 {
	public static void vararg(int...i) {
		System.out.println("I am int vararg");
	}
	public static void vararg(double...d) {
		System.out.println("I am double vararg");
	}
	public static void main(String[] args) {
		int[] x = new int[10];
		System.out.println("Class name : "+x.getClass().getName());
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		final int y = 10;
		System.out.println(y+1 );
		
		vararg();
		vararg(1);
		vararg(1.0,2,3);
		vararg(new int[] {1,2});
	}

}
