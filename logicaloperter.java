package practice;

import java.util.Scanner;

public class logicaloperter {

			//int  a=5;
			//int b=6;units
			//int c =8;
			public static void main(String[]args) {
				Scanner k = new Scanner(System.in);
				
				String name ="dhamu";
				System.out.println("Dhamu");
				
				System.out.println("SCORE:");
				int score=k.nextInt();
				
				if ((score<35)) {
					System.out.println("Poor student"+score);
					
				}
				else if((score>35)&&(score<=75)){
					
					System.out.println("Average student"+score);
					
				}
				else if((score>75)&&(score<=100)) {
					System.out.println(" He is Good Student he score :"+score);
				}
				
				else if ((score>100)) {
					System.out.println("invalid");
				}
				
			
				
				
			}


}
