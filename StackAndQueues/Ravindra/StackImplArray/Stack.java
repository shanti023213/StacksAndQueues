package StackImplArray;

public class Stack {
	
	int[] stack;
	int top;
	
	public Stack(){
		
		stack = new int[10];
		top = -1;
	}
	
	public void push(int data){
		
		if(top+1>stack.length-1){
			
			System.out.println("Stack is full");
		}else{
			
			stack[++top] = data;
		}
	}
	
	public int pop(){
		
		if(top==-1){
			System.out.println("Stack is empty");
			return -1;
			
		}else{
			
			return stack[top--];
		}
		
	}
	
	public int peek(){
		
		if(top==-1){
			System.out.println("Stack is empty");
			return -1;
			
		}else{
			
			return stack[top];
		}
		
	}

}
