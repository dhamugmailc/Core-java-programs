package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrraylist {

	public static void main(String[] args) {
		List<String>ss=new ArrayList<String>(); 
		ss.add("the");
		ss.add("programer");
		ss.add("should");
		ss.add("practice");
		ss.add("everyday");
		ss.add("to improve");
		ss.add("skills");
		ss.add("the");
		ss.remove(2);
		ss.set(2,"z");
		//System.out.println(ss.contains());
		System.out.println(ss);
		
		Iterator<String>s1=ss.iterator();
		while(s1.hasNext()) {
			System.out.println(s1.next());
		}
	}

}
