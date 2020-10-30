package innerClasses;

public class Test1 {
	int x = 10;
	class Test2{
		int x = 100;
		void m1() {
			int x = 1000;
			System.out.println(x);//1000
			System.out.println(this.x);//100
			System.out.println(Test2.this.x);//100
			System.out.println(Test1.this.x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1( ).new Test2().m1();
		}

}
