package collection;

import java.util.Deque;
import java.util.LinkedList;

public class deque {

	public static void main(String[] args) {
		Deque<Integer>ld=new LinkedList<>();
		ld.add(2);
		ld.offerFirst(1);
		ld.offerLast(3);
        System.out.println(ld);
        System.out.println();
        //shows head:
        System.out.println(ld.peekFirst());
          
        
        //remove first:
        System.out.println("removed 1st element");
        ld.pollFirst();
        System.out.println(ld);
      
        //remove last:
        System.out.println("removed last:");
        ld.pollLast();
        System.out.println(ld);
       
        
	}

}
