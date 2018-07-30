package StackImplLinkedList;

public class LinkedList {
	
	Node head;
	
	public LinkedList(){
		
		head = null;
	}
	
	public void add(int data){
		
		Node newNode = new Node(data);
		
		if(head==null){
			
			head = newNode;
		}else{
			
			newNode.next= head;
			head = newNode;
		}
	}
	
	public int delete(){
		
		
		if(head==null){
			
			System.out.println("Empty Stack");
			return -1;
		}else{
			
			int data = head.data;
			head = head.next;
			return data;
		}
	}
	
	public int peek(){
		
		if(head==null){
			return -1;
		}else{
			
			return head.data;
		}
	}

}
