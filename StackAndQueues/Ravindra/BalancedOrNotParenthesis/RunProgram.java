package BalancedOrNotParenthesis;

import java.util.Stack;

public class RunProgram {

	
	static Stack<Character> stack = new Stack<Character>();
	public static void main(String[] args) {
		
		String expression = "[()]{}{[()()]}";
		System.out.print(isBalanced(expression));
		
	}
	
	public static boolean isBalanced(String expression){
		for(int i=0;i<expression.length();i++){
			
			char c = expression.charAt(i);
			
			if(isOpening(c)){
				
				stack.push(c);
			}else{
				
				if(stack.isEmpty()){
					
					System.out.println("Not a balanced");
					return false;
				}
				
				if(!isMatching(stack.pop(),c)){
					System.out.println("Not a balanced");
					return false;
				}
					
				}
				
		}
		
		if(!stack.isEmpty()){
			
			return false;
		}else{
			return true;
			
		}
	}

	public static boolean isOpening(char c){
		
		if(c =='[' || c=='(' || c=='{'){
			return true;
		}else{
			
			return false;
		}
	}
	
	public static boolean isMatching(char opening, char closing){
		
		if(opening=='[' && closing==']'){
			return true;
		}else if(opening=='(' && closing==')'){
			
			return true;
		}else if(opening=='{' && closing=='}'){
			
			return true;
		}else{
			
			return false;
		}
	}

}
