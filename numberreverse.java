package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class numberreverse {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
//Iterator<Integer> s=l.iterator();
		//    while(s.hasNext()) {
		//    	System.out.println(s.next());
		//    }
   
    ListIterator s1=l.listIterator();
    System.out.println("Before the number reversed :");
    while(s1.hasNext()) {
    	System.out.println(s1.next());
    }System.out.println("**********************");
    System.out.println("After the number reversed :");
    while(s1.hasPrevious()) {
    	System.out.print(s1.previous());
    }
	}

}
