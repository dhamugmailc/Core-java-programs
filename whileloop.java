package practice;

import java.util.Scanner;

public class whileloop {
	

 public static void main(String arges[]){
		Scanner k = new Scanner(System.in);
		
		//int answer=(int)(Math.random()*100+1);
		int num=0;
		int answer=20;
		while(num!=answer){
				
				System.out.println("Enter the integer between 1 to 100");
			      num=k.nextInt();
		   if(num<answer) {
			   
			   System.out.println("your guess is lower than the num.");
			   System.out.println("guess again !");
				break;
		   }
		   else if(num>answer) {
				
				System.out.println("your guess is higher than the num ");
				System.out.println("guess again !");
				break;
			 }
			else { 
					System.out.println("*congrats* ");
					System.out.println("your guessed the crt number"); 
			      }
	         }; {
	        	 
	         }
		
	         
}
}
