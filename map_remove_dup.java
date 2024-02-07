package collection;

import java.util.*;

public class map_remove_dup {

	public static void main(String[] args) {
	String s="java";
	char s1[]=s.toCharArray();

	Map<Character,Integer>m=new LinkedHashMap<>();
     for(int i=0;i<s1.length;i++) {
    	 //if(m.containsKey(s1[i])==false){
    if(m.containsKey(s1[i])==true){	 
    	//m.put(s1[i],1);
    	int a=m.get(s1[i]);
		 int b=a+1;
		 m.put(s1[i],b);
    	 }
    	 else {
    		 /*int a=m.get(s1[i]);
    		 int b=a+1;
    		 m.put(s1[i],b);*/
    		 m.put(s1[i],1);	 
    	 }
     }//System.out.println(m);
     
	Set<Map.Entry<Character,Integer>>m1=m.entrySet();
     String s3="";
     for(Map.Entry<Character,Integer>s4:m1) {
    	// s3+=s4.getValue();
    	 s3+=s4.getKey();
     }
     System.out.println("output:");
     System.out.println(s3+"---->"+" length is "+""+s3.length());
     
	}
}