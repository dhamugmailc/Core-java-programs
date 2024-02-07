package practice;

import java.util.Scanner;

public class reverseloop {
	public static void main (String args[]) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the value :");
		int d =scan.nextInt();
		for(int i=9;i>=d;i--) {
			System.out.print(i+" ");
			
		}
		
	}

}
