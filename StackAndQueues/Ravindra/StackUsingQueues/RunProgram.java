package StackUsingQueues;

public class RunProgram {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		System.out.println(stack.peek());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
	}
}
