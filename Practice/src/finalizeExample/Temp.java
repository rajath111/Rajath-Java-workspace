package finalizeExample;

public class Temp {
	int num;
	public Temp() {
		num = 10;
	}
	
	public void setNum(int n) {
		num = n;
	}
	
	public int getNum() {
		return num;
	}
	
	public void finalize() {
		System.out.println("Finalize function called by garbage collector");
	}
}
