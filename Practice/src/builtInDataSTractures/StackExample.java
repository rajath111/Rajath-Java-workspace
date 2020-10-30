package builtInDataSTractures;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class StackExample {
	public static void main(String...strings) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.push(20);
		System.out.println(stack);
		stack.push(30);
		System.out.println(stack);
		stack.push(19);
		System.out.println(stack);
		stack.push(28);
		System.out.println(stack);
		stack.push(1928);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
}
