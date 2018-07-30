package MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class RunProgram {

	public static void main(String[] args) {
		
		Stack<Interval> stack = new Stack<Interval>();
	
		ArrayList<Interval> list1 = new ArrayList<Interval>();
		/*list1.add(new Interval(6,8));	
		list1.add(new Interval(1,9));	
		list1.add(new Interval(2,4));	
		list1.add(new Interval(4,7));*/
		
		list1.add(new Interval(1,2));	
		list1.add(new Interval(3,4));	
		list1.add(new Interval(5,6));	
		list1.add(new Interval(7,8));
		mergeInterval1(list1);
		
		//Print stack to get the final result
	
	}
	
	
	
	public static void mergeInterval(ArrayList<Interval> list){
	
		Collections.sort(list);
		
		Stack<Interval> stack = new Stack<Interval>();
		stack.push(list.get(0));
		for(int i=1;i<list.size();i++){
			if(stack.peek().end>list.get(i).start){
				Interval it = stack.pop();
				it.end =Math.max(it.end,list.get(i).end);
				stack.push(it);
			}
		}
		
		while(!stack.isEmpty()){
			Interval it = stack.pop();
			System.out.println(it.start + " ," +it.end);
		}
	}
	
	public static void mergeInterval1(ArrayList<Interval> list){
		
		Collections.sort(list);
		
		int index =0;
		//list.get(index).start = list.get(index)
		
		for(int i=1;i<list.size();i++){
			if(list.get(i).start <list.get(index).end){
				list.get(i-1).end = Math.max(list.get(index).end, list.get(i).end);
			}else{
				index++;
				list.get(index).start = list.get(i).start;
				list.get(index).end = list.get(i).end;
			}
		}
		
		for(int i=0;i<=index;i++){
			System.out.println(list.get(i).start);
			System.out.println(list.get(i).end);
		}
	}

}
