package Stringprograms;

import java.util.Scanner;

public class reverese_using_recursion {

	 public static String reverse(String s1) {
		if(s1.length()==0) {
		return s1;
		}
		return reverse(s1.substring(1))+s1.charAt(0);
		
	}
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter  string to reverse: ");
     String s1=s.nextLine();
     //String s2=s.nextLine();
     reverse(s1);
     System.out.println("String reversed :");       
     System.out.println(reverse(s1));
	}
	

}
