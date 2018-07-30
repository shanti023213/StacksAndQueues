package StockExchange;

import java.util.Stack;

public class RunProgram {

	
	
	public static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
	
		int[] a = {10,2,3,15,22,9,25,29};
		
		int[] b = stockExchange(a);
		
		for(int i=0;i<a.length;i++){
			
			System.out.println(b[i]);
			
		}

	}
	
	
	public static int[] stockExchange(int[] a){
		
		int[] b = new int[a.length];
		
		stack.push(0);
		b[0]=0;
		
		for(int i=1;i<a.length;i++){
			
			while(!stack.isEmpty() && a[stack.peek()]<a[i]){
				stack.pop();
			}
			b[i] = (!stack.isEmpty())? (i-stack.peek()-1) : i;
			stack.push(i);
		}
		
		return b;
	}

}
