package StackFindMinInOrder1Space;

import java.util.LinkedList;

public class Stack {
	
	
	LinkedList<Integer> list;
	int min;
	
	public Stack(){
		
		list = new LinkedList<Integer>();
	}
	
	public void push(int data){
		
		if(list.isEmpty()){
			min = data;
			list.push(data);
		}else if( min>data){
			
			list.push(data-min);
			min = data;
		}else{
		list.push(data);	
		}
		
	
	}
	

	public int pop(){
		
		int data = list.peek();
		
		if(data<min){
			data = min;
			min  = min-list.poll();
			
		}
		return data;
	}
	
	public int findMin(){
		
		return min;
	}
	
	
	

}
