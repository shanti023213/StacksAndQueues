package GreaterElementToTheRight;

import java.util.Stack;

public class RunProgram {

	
	public static void main(String[] args){
		
		
		
		int[] a = {10,20,1,5,25,500,600};
		int[] result = greaterElement(a);
		
		System.out.println("*******");
	}
	
	public static int[] greaterElement(int[] a){
		
		int[] result = new int[a.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		
		for(int i=1;i<a.length;i++){
			
			while(!stack.isEmpty() && a[stack.peek()]<a[i]){
				result[stack.peek()] = a[i];
				stack.pop();
				
			}
			stack.push(i);

		}	
		while(!stack.isEmpty()){
			
			result[stack.pop()]=-1;
		}
		
		return result;
	}
}
