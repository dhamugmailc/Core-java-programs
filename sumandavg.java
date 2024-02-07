package practice;

import java.util.Scanner;

public class sumandavg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter");
		int sum=0;
		float avg=0;
		for(int i=0;i<5;i++) {
			int num=s.nextInt();
		    sum+=num;
		}
		avg=sum/5;
		System.out.println("sum: "+sum);
		System.out.println("average: "+avg);
	}

}
