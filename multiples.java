package practice;

import java.util.Scanner;

public class multiples {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of terms to print :");
        int n=s.nextInt();
       for(int i=1;i<=n;i++) {
    	   System.out.println(i*5);
       }
		
	}

}
