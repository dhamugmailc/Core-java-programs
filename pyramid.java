package practice;

import java.util.Scanner;

public class pyramid {
	
	public static void main(String args[]) {
		int i,j,n,s;
	   Scanner w =new Scanner(System.in);
	   System.out.println("enter the valid num:");
	    n =w.nextInt();
	
	  for( i=1;i<=n;i++) {
		  
		  for(j=1;j<=n-i;j++){
			//if((i==4)||(i+j==5)||(j-i==3)) {
			  System.out.print(" ");
		   }
		//else {
			//	System.out.print(" ");
		for(int k=1;k<=i*2-1;k++){
		    System.out.print(i+"");
	      }
			 System.out.println();
		  }
	 
	  
	  }
	}

	  