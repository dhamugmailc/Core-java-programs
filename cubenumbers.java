package practice;

import java.util.Scanner;

public class cubenumbers {
	public static void main(String[]args) {
		Scanner s =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		//int num=scan.nextInt();
		//int a=1;
		//int b=2;
		//int c=3;
		for(int i=1;i<=4;i++) {
			int a=s.nextInt();
			System.out.println("Number is :"+a+" and cube of "+a+" is :"+a*a*a);
			
		}
	}

}
