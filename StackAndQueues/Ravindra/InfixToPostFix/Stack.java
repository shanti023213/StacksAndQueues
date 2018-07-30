package InfixToPostFix;

public class Stack {

	LinkedList list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	public void push(char data){
		
		list.add(data);
	}
	
	public char pop(){
		
		return list.delete();
	}
	
	
public char peek(){
		
		return list.peek();
	}

	public boolean isEmpty(){
	
	return list.head==null?true:false;
}
}
