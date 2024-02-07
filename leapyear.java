package practice;

import java.util.Scanner;

public class leapyear {
	public static void main(String []args) {
	 	 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the year :");
		int year =scan.nextInt();
		
		if (year%4==0||year%400==0) {
			System.out.println("It is a leap year.");
		}
		else if(year%100!=0){
			System.out.println("It is not a leap year.");
		}
		
	}

}
