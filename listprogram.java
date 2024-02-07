package collection;

import java.util.ArrayList;
import java.util.List;

public class listprogram {

	public static void main(String[] args) {
	List<Integer> s=new ArrayList<Integer>();
	 s.add(10);
	 s.add(20);
	 s.add(30);
	 s.add(40);
	 s.add(60);
	 s.add(70);
	 s.add(3,35);
	 s.set(5,100);
    System.out.println(s);List<Integer> s1=new ArrayList<Integer>();
	 s1.add(10);
	 s1.add(20);
	 s1.add(30);
	 s1.add(40);
	 s1.add(60);
	 s1.add(70);
	 s1.add(3,35);
	 s1.set(5,100);
  // System.out.println(s); 
    System.out.println(s1.contains(40));
	}
}
