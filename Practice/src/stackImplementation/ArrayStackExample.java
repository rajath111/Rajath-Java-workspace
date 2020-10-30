package stackImplementation;

public class ArrayStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max size of the stack is :"+StackArray.maxSize());
		StackArray stack = new StackArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
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
