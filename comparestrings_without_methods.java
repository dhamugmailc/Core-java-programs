package Stringprograms;

public class comparestrings_without_methods {

	public static void main(String[] args) {
    String s1="google";
   // String s1="asdfgh";
    String s2="Google";
    System.out.println("The given strings are :");
    System.out.println("s1 :"+s1);
    System.out.println("s2 :"+s2);
   // if(s1.length()==s2.length()) {
    	if(s1.contains(s2)) {
    	System.out.println("This s1 and s2 strings are equal");
    }
    else {
    	System.out.println("Not equal");
    }
  
	}

}
