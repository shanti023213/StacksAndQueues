package StackFindMinInOrderNSpace;

public class RunProgram {

	public static void main(String[] args) {
		

		Stack stack = new Stack();
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println(stack.findMin());
		stack.pop();
		stack.pop();
		
		System.out.println(stack.findMin());

	}

}
