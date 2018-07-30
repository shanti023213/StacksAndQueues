package PatrolPump;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class PetrolNode{
	
	int petrol;
	int distance;
	
	public PetrolNode(int petrol,int distance){
		
		this.petrol =petrol;
		this.distance =distance;
	}
}

public class Test {

	
	public static void main(String[] args) {
		
		ArrayList<PetrolNode> list = new ArrayList<PetrolNode>();

		list.add(new PetrolNode(10,5));
		list.add(new PetrolNode(2,7));
		list.add(new PetrolNode(3,4));
		list.add(new PetrolNode(4,2));
		list.add(new PetrolNode(2,1));
		
		travelSequence(list);
	}
	
	public static void travelSequence(ArrayList<PetrolNode> list){
		
		int start =0;
		int end =1;
		int petrolAvailable = list.get(0).petrol-list.get(0).distance;
		
		while(petrolAvailable<0 || start!= end){
			
			while(petrolAvailable<0 && start !=end){
				petrolAvailable = petrolAvailable -list.get(start).petrol + list.get(start).distance;
				start = (start+1)%list.size();
			}
			petrolAvailable = petrolAvailable+list.get(end).petrol - list.get(end).distance;
			end = (end+1)%list.size();
		}
		
		
		System.out.println(start);
		System.out.println(end);
	}
		
	

}
