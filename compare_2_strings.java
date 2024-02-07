package Stringprograms;

import java.util.Scanner;

public class compare_2_strings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Strings to compare :");
		String s1=s.next();
		String s2=s.next();
	  //String s2=s.nextLine();
       if(s1.length()==s2.length()) {
    	   System.out.println("The length of Two Strings are equal.");
       }
       else {
    	   System.out.println("Not equal");
       }
	}
}
		//boolean notequal=false;
		/*//if(s1.length()==s2.length()) {
		try {
         for(int i=0;i<s1.length();i++) {
        	 if(s1.charAt(i)==s2.charAt(i)) {
        		 notequal=true;
        		 
        	 }    
         }
		
         if(notequal) {
        	 System.out.println("Content of Two Strings are equal.");
         }
         else {
        	 System.out.println("Not equal");
         }
		}catch(Exception e) {
			System.out.println("Please Enter the two Strings in same length.");
		}
		}
	}*/

		
//**************************************************************
		/*int cnt=0;
		int a=0;
       for(int i=0;i<s1.length();i++) {
    	   for(int j=0;j<s2.length();j++) {
    		 if(s1.charAt(i)==s2.charAt(j)) {
    			 //System.out.println("Equal");
    			 cnt++;
    			 a=cnt;
    		 }
    		 else {
    			 System.out.println("Not equal");
    		 }
    	  	 
    	   if(a>0) {
    		   System.out.println("e");
    	   }
    	   else {
  			 System.out.println("Not equal");
  		 }*/
    
//***************************************************************	
		/*char[]ss=s1.toCharArray();
		char[]sss=s2.toCharArray();
		for(int i=0;i<ss.length;i++) {
			for(int j=0;j<sss.length;j++) {
				if(ss[i]==sss[j]) {
					System.out.println("e");
				}
				else {
					System.out.println("n");
				}
			}
		}*/
	


