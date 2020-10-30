package synchronizeddemo;

public class Display {
	public synchronized void wish(String s) {
		System.out.println("Good morning "+s+"!");
	}
}
