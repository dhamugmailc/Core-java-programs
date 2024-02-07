package Stringprograms;

public class reverseString_recursion {

	public static void main(String[] args) {
     String s="hello";
     System.out.println("Reverse of the string is:");
     System.out.println(reversestring(s));
	}
	public static String reversestring(String s) {
		if(s.length()<=1) {
			return s;
		}
		return reversestring(s.substring(1))+s.charAt(0);
	}

}
