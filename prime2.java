package practice;

import java.util.Scanner;

public class prime2 {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter for find :");
	int num=s.nextInt();
	int cnt=0;
	for(int i=1;i<=num;i++) {
	 if(num%i==0) {
		 cnt++;
	 }
	}if(cnt==2) {
		System.out.println("It is prime number");
		int ss=(int) Math.sqrt(num);
		System.out.println(ss);
	}
	else {
		System.out.println("Not a prime");
	}
	
}
}
