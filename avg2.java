package arrays;

import java.util.Scanner;

public class avg2 {
public static void main(String args[]) {
	Scanner ss=new Scanner(System.in);
	System.out.println(" enter array elements :");
	int []num=new int[4]; 
	int s=0,avg=0;
	for(int i=0;i<4;i++) {
		num[i]=ss.nextInt();
		s+=num[i];
	}
	avg=s/4;
	System.out.println("average value :"+avg);
}
}
