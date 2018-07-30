package StackImplLinkedList;

public class Stack {
	
	LinkedList list;

	public Stack(){
		
		list = new LinkedList();
		
	}
	
	public void push(int data){
		
		list.add(data);
	}
	
	public int pop(){
		
		return list.delete();
	}
	
	public int peek(){
		return list.peek();
		
	} 
}
