package stackImplementation;

public class StackArray {
	static int max = 100;
	int []array = new int[100];
	int top = -1;
	
	public static int maxSize() {
		return max;
	}
	
	public StackArray() {
		System.out.println("The maximum size of the stack is :"+max);
	}
	public void push(int data) {
		if(top==max-1)
			System.out.println("The stack is full!!");
		else {
			top++;
			array[top] = data;
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("The stack is empty!!");
			return 0;
		}
		else {
			return array[top--];
		}
	}
	public int peek() {
		if(top==-1) {
			System.out.println("The stack is empty!!");
			return 0;
		}
		else {
			return array[top];
		}
	}

}
