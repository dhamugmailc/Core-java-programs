package Stringprograms;

import java.util.Scanner;

public class subsstring_divide_n_equalparts {

	public static void main(String[] args) {
    Scanner s1=new Scanner(System.in);
   // String s=s1.nextLine();
    String s="abcdefghijklmnopqrstuvwxy";
    System.out.println("Enter the number to divide equal parts: ");
    int n=s1.nextInt();
    if(s.length()%n==0) {
    
    	System.out.println("this can be divide into n equal parts :");
    	int st=0;
    	int end=n;
    	for(int i=0;i<n;i++) {
    		System.out.println(s.substring(st, end));
    		st=end;
    		end+=n;
    	}
    }else {
    	System.out.println("this string cannot be divided");
    }

	}

}
