package stackImplementation;

public class LinkedListStackExample {
	public static void main(String...strings) {
		LinkedListStack stack = new LinkedListStack();
		stack.push(10);
		stack.push(20);
		stack.push(1928);
		stack.push(40);
		stack.push(50);
		stack.push(90);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
