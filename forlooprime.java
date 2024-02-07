package practice;

import java.util.Scanner;

public class forlooprime{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=s.nextInt();
		              //int num=7;
		int count=0;// only divisible by  two factors .
		

	for(int i=1;i<=num;i++){
		
			   if(num%1==0&&num/num==0) {
					count++; //INCREASE COUNT
			             }	}
	                 // }
	          if(count==2) {
		         System.out.println("It is a prime number.");
	             }
	
	      else {
		      System.out.println(" It is  not prime number");
	      }	    
	
		

	}
}
