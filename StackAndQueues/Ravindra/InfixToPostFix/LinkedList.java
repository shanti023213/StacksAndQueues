package InfixToPostFix;

public class LinkedList {

	Node head;
	
	public LinkedList(){
		
		head = null;
	}
	
	public void add(char data){
		
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next= head;
			head = newNode;
		}
	}
	
	
	public char delete(){
		
		if(head == null){
			System.out.println("Stack is Empty");
			return 'N';
		}else{
			char data = head.data;
			head = head.next;
			return data;
		}
	}
	
	
	public char peek(){
		if(head == null){
			System.out.println("Stack is Empty");
			return 'N';
		}else{
		return head.data;
		}
	}
}
