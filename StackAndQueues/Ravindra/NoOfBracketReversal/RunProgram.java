package NoOfBracketReversal;

import java.util.Stack;

public class RunProgram {

	public static void main(String[] args) {
		
		//String expression = "}}}{{}}{{{{}";
		String expression = "}}}{{{";
		
		double minReversals = minReversals(expression);
		System.out.println(minReversals);
	}
	
	
	public static double minReversals(String expression){
		
		if(expression.length()%2!=0){
			
			System.out.println("Not enough closed/open braces");
			return -1;
		}
		
		Stack<Character> stack = new Stack<Character>();
		
		double m=0,n=0;
		for(int i=0;i<expression.length();i++){
			
			char c= expression.charAt(i);
			
			if(c =='{')
			{
				stack.push(c);
			}else if(c=='}'){
			
				if(!stack.isEmpty()){
					
					stack.pop();
				}else{
					
					n++;
				}
			}
		}
		
		
		while(!stack.isEmpty()){
			
			stack.pop();
			m++;
		}
		
		  // return ceil(m/2) + ceil(n/2) which is
	      // actually equal to (m+n)/2 + n%2 when
	      // m+n is even.
		return Math.ceil(m/2)+Math.ceil(n/2);
		//return ((m+n)/2 + n%2);
	}

}
