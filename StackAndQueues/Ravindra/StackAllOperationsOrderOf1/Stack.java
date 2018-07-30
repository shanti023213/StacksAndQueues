package StackAllOperationsOrderOf1;

public class Stack {

	Node head;
	Node mid;
	int count;
	
	public Stack(){
		head =mid= null;
		count=0;
	}
	
	
	public void push(int data){
		
		Node newNode = new Node(data);
		count++;
		if(head==null){
			
			head = newNode;
			mid =head;
			
		}else{
			if(count%2!=0){
				mid =mid.left;
			}
			newNode.right= head;
			head.left=newNode;
			head= newNode;
		}
		
	}
	
	
	public int pop(){
		
		if(head!=null){
			
			if(count%2==0){
				mid = mid.right;
			}
		count--;
		int data = head.data;
		head.left=null;
		head = head.right;
		return data;
		}else{
			
			return -1;
		}
	}
	
	
	public void deleteMid(){
		
		count--;
		if(mid!=null){
			if(mid.left!=null){
				mid.left.right=mid.right;
				if(mid.right!=null){
					mid.right.left =mid.left;
				}
				if(count%2==0){
					mid = mid.right;
				}
				if(count%2!=0){
					mid =mid.left;
				}
			}else{
				
				mid=null;
			}
		}
	}
}
