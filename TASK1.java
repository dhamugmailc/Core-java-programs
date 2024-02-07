package practice;

import java.util.Scanner;

public class TASK1 {
    public static void main(String args[]) {  
		Scanner dk=new Scanner(System.in);
      
       System.out.println("units");
    	int units =dk.nextInt();
    	int a=0;
    	int b=2;
    	int c=5;
    	int bill;
		 if (units<=100){
			  System.out.println("charges:"+a);
		   }
		   
		   else if ((units>100)&&(units<=200)){
			   bill =(units-100)*a;
			   System.out.println(bill);
		   }
		   
		   else if ((units>300)) {
			   bill =200*b+(units-300)*c;
			   System.out.println("TOTAL BILL:"+bill);
		   }
    	
    	
    	
    }

    	
	
	
	
	

}
