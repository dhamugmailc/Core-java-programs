package arrays;
import java.util.Scanner;
public class primenum {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		//int j=0;
		
		 int cnt=0;
		 if(n>1) {
		for(int i=1;i<=n;i++) {
	     
				  if(n%i==0) {
					
					 cnt++;
				   }				  
				}
		if(cnt==2) {
			System.out.println("It is prime number ");
			
		}
	  else {
		  System.out.println("It is not prime number ");
	  }
			
		 }else  {
			 System.out.println("enter above 1");
		 }
				
	}	
			
}

	
	



