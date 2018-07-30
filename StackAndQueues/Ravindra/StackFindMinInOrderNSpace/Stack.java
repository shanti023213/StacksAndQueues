package StackFindMinInOrderNSpace;

import java.util.LinkedList;

public class Stack {
	
	
	LinkedList<Integer> list1;
	LinkedList<Integer> list2;
	int min;
	
	public Stack(){
		
		list1 = new LinkedList<Integer>();
		list2 = new LinkedList<Integer>();
		min= Integer.MAX_VALUE;
	}
	
	public void push(int data){
		
		list1.push(data);
		if(data <min){
			min = data;
			list2.push(data);
		}else{
			
			list2.push(min);
		}
	}
	

	public int pop(){
		
		int data = list1.pop();
		list2.pop();
		return data;
	}
	
	public int findMin(){
		
		return list2.peek();
	}
	
	
	

}
