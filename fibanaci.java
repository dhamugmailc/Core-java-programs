package practice;

import java.util.Scanner;

public class fibanaci {
	public static void main(String[]args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the num:");
		 int n=s1.nextInt();
	      int a=0,b=1,s=0;
	      System.out.print(a+" ");
	     System.out.print(b);
	    
	     for(int i=1;i<n;i++) {
	    	 s=a+b;
	    	 System.out.print(" "+s);
	    	 a=b;
	    	 b=s;
	     }
	}
      

}
