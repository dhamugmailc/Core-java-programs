package arrays;

import java.util.Scanner;

public class fibanaciarray {
	public static void main(String[]args) {
	      int a=0,b=1,s=0;
	     int[]num=new int[30];
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the num:");
	     int n=sc.nextInt();	     
	     System.out.print(a+" ");
	     System.out.print(b);
	     for(int i=1;i<=n;i++){
	    	 s=a+b;
	    	 System.out.print(" "+s);
	    	 a=b;
	    	 b=s;
	     }
	}
}
