package ReverseStack;

import java.util.Stack;

public class RunProgram {

	static Stack<Integer> stack = new Stack<Integer>();
	
	
public static void main(String[] args){
	
	
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	
	reverse(stack);
	
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
}


	public static void reverse(Stack<Integer> stack){
	
		if(!stack.isEmpty()){
			int data = stack.pop();
			reverse(stack);
			addToStack(data);
		}
	}
	
	public static void addToStack(int data){
		
		if(stack.isEmpty()){
			stack.push(data);
		}else{
			
			int element =stack.pop();
			addToStack(data);
			stack.push(element);
		}
		
	}
}
