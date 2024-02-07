package Stringprograms;

public class remove_special_char {

	public static void main(String[] args) {
		String s1="*task*1 @#$%Done/";
		System.out.println("before: "+s1);
		  System.out.println("after: "+s1.replaceAll("[^a-zA-Z0-9 ]","")); 
		 
	}

}
 