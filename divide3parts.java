package Stringprograms;

import java.util.Scanner;
import java.util.*;
public class divide3parts {

	public static void main(String[] args) {
    StringBuilder s=new StringBuilder("abcdefghij");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n:");
    int n=sc.nextInt();
   
    char fill='x';
  // StringBuilder s2=new StringBuilder(s.append("xx"));
   //System.out.println(s2);

   while(s.length()%n!=0) {
    	s.append(fill);
    }
    int g=s.length()/n;
    String[] gs = new String[g];

    	for(int i=0;i<g;i++) {
    	//System.out.println(s.substring(st,end));
    		
	    	int  st=i*n;
	    	int  end=st+n;
	    	 gs[i]=s.substring(st, end);
    	}
    	for(String grs:gs) {
    		System.out.println(grs);
    	}
    	
    }
 	}
