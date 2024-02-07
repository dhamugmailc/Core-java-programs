package Stringprograms;

import java.util.Scanner;

public class startswith_color {

	public static void main(String[] args) {
    //String s="blacksea";
		Scanner s1=new  Scanner(System.in);
		System.out.println("Enter the string :");
		String s=s1.nextLine();
    System.out.println("the given string is: "+s);
    if (s.startsWith("black")) {
    	System.out.println("The string begins with the color: black.");
    }else if(s.startsWith("red")) {
    	System.out.println("The string begins with the color: red.");
    }else{
    	System.out.println("The String is empty");
    }
	}

}
