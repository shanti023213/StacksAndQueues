package InfixToPostFix;

public class RunProgram {

	static Stack stack = new Stack();
	public static void main(String[] args) {
		
		
		String infixexpression = "a*b+(c-d)";
		String expression = postfixExprssion(infixexpression);
		System.out.println("Expression: "+ expression);
		
		String postfixExpression = "321*+";
		
		//String finalResult =
		System.out.println("Expression: "+ postfixEvaluation(postfixExpression));
	}
	
	
	public static String postfixExprssion(String expression){
		
		StringBuffer result= new StringBuffer();
		
		for(int i=0;i<expression.length();i++){
			
			char c = expression.charAt(i);
			
			if(Character.isLetterOrDigit(c)){
				result.append(c);
				
			}else if(c== '('){
					
					stack.push(c);
				}else if(c==')'){
					
					while(!stack.isEmpty() && stack.peek()!='('){
						
						result.append(stack.pop());
					}
					
					if(!stack.isEmpty() && stack.peek()!='('){
						
						return "Invalid Expression";
					}else{
						
						stack.pop();
					}
				}else{
					
					while(!stack.isEmpty() && prec(c)< prec(stack.peek())){
						result.append(stack.pop());
						
					}
					stack.push(c);
				}
			}
		
		while(!stack.isEmpty()){
			
			result.append(stack.pop());
		}
		
		return result.toString();
	}
	
	public static int prec(char c){
		//BODMAS
		
		switch(c)
		{
		
		case '+':
		
		case '-':
			return 1;
		case '/':
		case '*' :
			return 2;
		case '^':
            return 3;
		
		}
		
		return -1;
	}
	
	
	public static int postfixEvaluation(String expression){
		
		java.util.Stack<Integer> stack2 = new java.util.Stack<Integer>();
		
		for(int i=0;i<expression.length();i++){
			
			char a = expression.charAt(i);
			
			
			if(Character.isLetterOrDigit(a)){
				stack2.push(a-'0');
				
			}else{
				
				int letter1 = stack2.pop();
				int letter2 = stack2.pop();
				int result = 0;
				
				switch(a){
					case '+' :
						result = (letter2) + (letter1);
						break;
					case '-' :
						result = (letter2) - (letter1);
						break;
						
					case '*' :
						result = (letter2) * (letter1);
						break;
					case '/' :
						result = (letter2) / (letter1);
						break;
				}
				
				stack2.push(result);
				//Check Unary or Binary operator as well
				
				
			}
		}
		
		return stack2.pop();
	}

	
	
}
