package QueueImplUsingStacks;

public class Queue {
	
	Stack stack1 ;
	Stack stack2;
	
	public Queue(){
		
		stack1 = new Stack();
		stack2 = new Stack();
	}
	
	public void enqueue(int data){
		
		stack1.push(data);
	}
	
	
	public int dequeue() {
		
		if(!stack2.isEmpty()){
			
			int data = stack2.pop();
			return data;
		}else if(!stack1.isEmpty()){
			
			while(!stack1.isEmpty()){
			int data = stack1.pop();
			stack2.push(data);
			}
			
			int data = stack2.pop();
			return data;
		}else{
			
			System.out.println("Queue is empty");
			return -1;
		}
		
	}

}
