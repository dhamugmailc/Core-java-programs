package Stringprograms;
import java.util.HashMap;
import java.util.Map;

public class isomorphic {

		    public static boolean isIsomorphic(String s, String t) {
		        if (s.length() != t.length()) {
		            return false;
		        }

		        Map<Character, Character> map = new HashMap<>();
		        Map<Character, Boolean> a = new HashMap<>();

		        for (int i=0;i<s.length();i++) {
		            char charS=s.charAt(i);
		            char charT=t.charAt(i);

		            if (map.containsKey(charS)) {
		                if (map.get(charS)!=charT) {
		                    return false; 
		                }
		            } else {
		                if (a.containsKey(charT)) {
		                    return false; 
		                }
		                map.put(charS,charT);
		                a.put(charT,true);
		            }
		        }

		        return true;
		    }

		    public static void main(String[] args) {
		        String s1="egg";
		        String t1="add";
		        System.out.println(isIsomorphic(s1, t1)); 

		        String s2="foo";
		        String t2="bar";
		        System.out.println(isIsomorphic(s2, t2)); 

		        String s3="paper";
		        String t3="title";
		        System.out.println(isIsomorphic(s3, t3)); 
		   


	}

}
