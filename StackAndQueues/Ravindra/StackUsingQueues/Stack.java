package StackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	public Stack(){
		
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}
	
	
	public void push(int data){
		
		if(queue1.isEmpty() && queue2.isEmpty()){
			
			queue1.add(data);
		}else if(queue1.isEmpty()){
			
			queue1.add(data);
			
			while(!queue2.isEmpty()){
				queue1.add(queue2.poll());
			}
		}else {
			
			queue2.add(data);
			while(!queue1.isEmpty()){
				queue2.add(queue1.poll());
			}
				
			}
		}
	
	
	public int pop(){
		
	 if(!queue1.isEmpty()){
			
			return queue1.poll();
		}
		else if(!queue2.isEmpty()){
			
			return queue2.poll();
		}
	return -1;
		
	}
	
	public int peek(){
		
		 if(!queue1.isEmpty()){
				
				return queue1.peek();
			}
			else if(!queue2.isEmpty()){
				
				return queue2.peek();
			}
		return -1;
			
		}
	}

