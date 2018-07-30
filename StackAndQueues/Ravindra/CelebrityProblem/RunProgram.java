package CelebrityProblem;

import java.util.Stack;

public class RunProgram {
	
	static int[][] a = { { 0, 0, 1, 0 },
 			{ 0, 0, 1, 0 },
 			{ 0, 0, 0, 0 }, 
 			{ 0, 0, 1, 0 } };

	public static void main(String[] args) {
	
	 

	 System.out.println("******" +printCelebrity());
	}
	
	
	public static int printCelebrity(){
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<a.length;i++){
			stack.add(i);
		}
		
		while(!stack.isEmpty() && stack.size()!=1){
			
			int x = stack.pop();
			int y = stack.pop();
			
			if(isknows(x,y)){
				
				stack.push(y);
			}else{
				
				stack.push(x);
			}
		}
		
		int z = stack.pop();
		
		for(int i=0;i<a.length;i++){
			
			if(z!=i && (!isknows(i,z) ||isknows(z,i))){
				return -1;
			}
		}
		return z;
	}
	
	public static boolean isknows(int s, int t){
		
		if(a[s][t] == 1){
			
			return true;
		}else{
			
			return false;
		}
	}

}
