package collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList();
		q.offer("ss");
		q.offer("dhamu");
		q.offer("arun");
		
		System.out.println("before :");
		System.out.println(q);
		
		System.out.println("after:");
		//remove and display:-
		
		q.poll();
		System.out.println(q);
		
		//displays:-
		
		//System.out.println(q.poll());
		
		//q.peek();
		//System.out.println(q.peek());
	}

}
