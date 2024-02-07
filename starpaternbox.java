package practice;

import java.util.Scanner;

public class starpaternbox {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num=scan.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
