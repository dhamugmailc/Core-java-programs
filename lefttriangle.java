package practice;

import java.util.Scanner;

public class lefttriangle {
	public static void main(String[]args) {
		 Scanner w =new Scanner(System.in);
		   System.out.println("Enter the number:");
		    int num=w.nextInt();
		   // int j=0;
		    for (int i=1;i<num;i++) {
		    	
		    	for (int s=1;s<(num-i);s++) {
		    	    System.out.print(" ");
		    	}
		    	for (int j=1;j<=i;j++) {
				    		System.out.print("* ");
				    		
		    	}
		    	System.out.println();
		    }
	}

}
