package Stringprograms;

import java.util.Scanner;

public class count_of_char {

	public static void main(String[] args) {
	    String s="DhamDharan";
	      System.out.println("String name:"+s);
		 Scanner sc=new Scanner(System.in);
		 for(int j=1;j<=3;j++) {
			 System.out.println("Enter the character to check the count :");
		        char N=sc.next().charAt(0);
		         int cnt=0;
		         for(int i=0;i<s.length();i++) {
		        	 if(s.charAt(i)==N) {
		               cnt++;
		        	 }
		         }
		         System.out.println("The count for character '"+N+"' is :"+cnt);  
		         
		 }
      }

}
