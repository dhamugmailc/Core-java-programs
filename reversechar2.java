package Stringprograms;

import java.util.Scanner;

public class reversechar2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" to find palindrome enter:");
        String ss=s.next();
        String s1="";
        for(int i=ss.length()-1;i>=0;i--) {
        	s1 +=ss.charAt(i);
        }
        System.out.println(s1);
        //System.out.println(ss.substring(1)+ss.charAt(0));
        if(s1.equals(s1)) {
        	System.out.println("The String is palindrome ");
        }
        else {
        	System.out.println("Not a palindrome");
        }
	}

}
