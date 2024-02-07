package practice;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter :");
		int n=s.nextInt();
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println("It is prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
