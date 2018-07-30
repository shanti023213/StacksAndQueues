package QueueImplArray;

public class Queue {

	
	int[] queue ;
	int size =10;
	int front,rear;
	
	public Queue(){
		
		queue = new int[size];
		front=rear=0;
	}
	
	
	public void enqueue(int data){
		
		rear = (rear+1)%size;
		System.out.println(rear+"rear");
		if(front==rear){
			
			System.out.println("Queue is full");
			rear = rear==0?size-1:--rear;
		}else{
			
			queue[rear] = data;
		}
	}
	

	public int dequeue(){
		
		if(front==rear){
			
			System.out.println("Queue is empty");
			return -1;
		}else{
			front = (front+1)%size;
			return queue[front];
		}
	}
	
}
