package collection;
import java.util.*;
public class arraylist_delete_rsorting {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
          a.add(4);
          a.add(5);
          a.add(6);
          a.add(7);
          a.add(2);
          a.add(9);
          a.add(6);
          a.add(2);
          System.out.println("Before the required output: ");
          System.out.println(a);
         a.remove(3);
         a.remove(5);
        a.remove(5);
   	   Collections.sort(a); // new method for sort i get this
       System.out.println("Reqiured output: ");
       System.out.println(a);
	}

}
