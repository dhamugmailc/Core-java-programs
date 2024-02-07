package practice;

import java.util.Scanner;

public class equalnumsornot {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int fnum=scan.nextInt();
		int snum=scan.nextInt();
		int tnum=scan.nextInt();
		
		if (fnum==snum&&snum==tnum) {
			System.out.println("All numbers are equal");
		}
		if(fnum!=snum&&snum!=tnum) {
			System.out.println("All numbers are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
	}
}
