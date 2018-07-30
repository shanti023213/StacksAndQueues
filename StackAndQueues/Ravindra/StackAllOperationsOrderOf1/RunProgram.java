package StackAllOperationsOrderOf1;



public class RunProgram {

	public static void main(String[] args) {
		
		Stack  stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.deleteMid();
		stack.deleteMid();
		stack.deleteMid();
		stack.deleteMid();
		stack.deleteMid();
		
		stack.deleteMid();
		System.out.println("********"+((stack.mid!=null)?stack.mid.data:"Stack is empty"));

		
	}

}
