package collection;

import java.util.HashMap;
import java.util.Map;

public class key_valuemap {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(1,"Dhamu");
		m.put(2,"");
		m.put(3,"karthi");
		m.put(4,"surya");
		System.out.println("Key"+"\t"+"Values");
		for(Map.Entry<Integer,String>e:m.entrySet()) {
			
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
	}

}
