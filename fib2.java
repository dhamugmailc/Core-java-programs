package practice;

import java.util.Scanner;

public class fib2 {
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
	System.out.println("enter for fib:");
	int num=s.nextInt();
	int a=0, b=1,sum=0;
	System.out.print(b+"");
	for(int i=1;i<num;i++) {
		sum=a+b;
		System.out.print(" "+sum);
		a=b;
		b=sum;
	}
}
}
