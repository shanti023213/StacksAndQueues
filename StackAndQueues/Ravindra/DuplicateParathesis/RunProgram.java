package DuplicateParathesis;

import java.util.Stack;

public class RunProgram {

	public static void main(String[] args) {
		
		String expression ="(((1+2))+(3*4))";
		System.out.println(isDuplicateExists(expression));
	}
	
	
	public static boolean isDuplicateExists(String expression){
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<expression.length();i++){
			
			char c = expression.charAt(i);
			
			if(c!=')'){
				
				stack.push(c);
			}else{
				
				if((stack.peek()=='(')){
					System.out.println("Duplicate Found");
					return true;
				}else{
					
					while(!stack.isEmpty()){
						if(stack.pop()=='('){
							break;
						}
						
					}
					
					
				}
				
			}
			
		}
		return false;
	}

}
