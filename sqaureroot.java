package practice;

import java.util.Scanner;

public class sqaureroot {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=scan.nextInt();
       int i=scan.nextInt();
       int a=(int)Math.sqrt(n);
       int b=(int)Math.sqrt(i);
       System.out.println("Square root of "+n+" is "+a);
       System.out.println("square root of "+i+" is "+b);
	}

}
