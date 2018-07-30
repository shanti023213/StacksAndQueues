package StackFindMinInOrder1Space;

public class RunProgram {

	public static void main(String[] args) {
		

		Stack stack = new Stack();
		stack.push(3);
		System.out.println(stack.findMin());
		stack.push(2);
		System.out.println(stack.findMin());
		stack.push(1);
		System.out.println(stack.findMin());
		stack.pop();
		System.out.println(stack.findMin());
		stack.pop();
		
		System.out.println(stack.findMin());

	}

}
