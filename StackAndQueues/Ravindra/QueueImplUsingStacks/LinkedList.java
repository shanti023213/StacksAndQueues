package QueueImplUsingStacks;

public class LinkedList {
	
	Node head;
	
	public LinkedList()
	{
		
		head = null;
	}
	
	
	public void add(int data){
		
		Node newNode = new Node(data);
		
		if(head == null){
			
			head = newNode;
		}else{
			
			newNode.next= head;
			head= newNode;
			
		}
	}
	
	
	public int delete(){
		
		if(head == null){
			
			return -1;
		}else{
		
			int element = head.data;
			head = head.next;
			return element;
			
		}
	}
	
	public int peek(){
		
		if(head == null){
			
			System.out.println("No elements found");
			return -1;
		}else{
		
			return head.data;
			
		}
	}
}


