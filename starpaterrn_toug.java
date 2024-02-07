package practice;

import java.util.Scanner;

public class starpaterrn_toug {
	
 public static void main(String[] args) {
	 Scanner scan =new Scanner(System.in);
		System.out.println("ETER THE NUM:");
		int n=scan.nextInt();         
	      for (int i=1;i<=n;i++) {
	            for (int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            for(int k=1;k<=2*(n-i);k++) {
	                System.out.print(" ");
	            }
	            for(int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	          }
	      
	        for (int i=n-1;i>=1;i--) {
	            for(int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            for(int k=1;k<=2*(n-i);k++) {
	                System.out.print(" ");
	            }
	            for (int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}


