package practice;

import java.util.Scanner;

public class starpattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num=scan.nextInt();
     for(int i=1;i<=num;i++) {
    
    	for(int j=1;j<=num;j++) {
    		if(i==num||i==1||j==num||j==1) {
    	 System.out.print("*");
    		}
    		else {
    		 System.out.print(" ");
    		}
     }	
    	 System.out.println();
    	 }
    	
	}
     
	}

