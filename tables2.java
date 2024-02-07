package practice;

import java.util.Scanner;

public class tables2 {
	
	public static void main(String[]args) {
		Scanner d = new Scanner(System.in);
      
		System.out.println("enter the  value:");
		int n=d.nextInt();
	
		 for(int r=1;r<=10;r++) {
			System.out.println(r+"*"+n+"="+r*n); 
		 }	  
		 

}
}