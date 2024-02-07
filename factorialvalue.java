package practice;

import java.util.Scanner;

public class factorialvalue {
	
	public static void main (String args[]) {
		Scanner x=new Scanner(System.in);
      //  String name= "num";
		
        System.out.println("ENTER THE ANY NUMBER:");
         int num=x.nextInt();
      // System.out.println("FACTERS for this nums are:");
         int j=1;
        for(int i=1;i<=num;i++) {
        	  j*=i;
        		//System.out.println(d);
             }
		System.out.println("factorial value of "+num+" is"+" :" +j);

}
}