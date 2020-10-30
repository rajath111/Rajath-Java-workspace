package school;

public class Message {
	Message(){
		System.out.println("I am constructor in Message class!!");
		display();
	}
	void Message() {
		System.out.println("I am Message method, not a constructor!");
	}
	
	void display() {
		System.out.println("Hello boss!");
		Message();
	}
	public static void main(String...strings) {
		Message m  = new Message();
		m.display();
	}
}