package practice;

import java.util.Scanner;

public class starpattern {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  the value :");
		int a=scan.nextInt();
		for (int i=0;i<a;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			
			}for(int s=0;s<(5-i);s++) {
				System.out.print(" ");
			
			}
			System.out.println();
			
		}
		
	}
	

}
   