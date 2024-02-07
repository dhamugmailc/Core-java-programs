package practice;
import java.util.Scanner;

public class logicalopeg2 {
	public static void main(String[]args) {
		Scanner dk=new Scanner(System.in);
		
		System.out.println("Dhamu");
		int dhamu=dk.nextInt();
		
		System.out.println("shiva");
		int shiva=dk.nextInt();
		
		System.out.println("krish");
		int krish=dk.nextInt();
		
		   if ((dhamu>shiva)&&(dhamu>krish)){
			  System.out.println("highest score by Dhamu"+dhamu);
		   }
		   
		   else if ((shiva>dhamu)&&(shiva>krish)){
			   System.out.println("highest score by shiva"+shiva);
		   }
		   
		   else if ((krish>dhamu)&&(krish>shiva)) {
			   System.out.println("highest score by krish"+krish);
		   }

		   }
			  
			   
		   }
		
		
		

	
	
	
	
	
	
	
	
	
	


