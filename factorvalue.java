package practice;

import java.util.Scanner;

public class factorvalue {
	public static void main (String args[]) {
		Scanner x=new Scanner(System.in);
      //  String name= "num";
        System.out.println("ENTER THE ANY NUMBER:");
        int num=x.nextInt();
        System.out.println("FACTERS for this nums are:");
        
        for(int d=1;d<=num;d++) {
        	
        	if(num%d==0) {
        		System.out.println(d);
        	   
        		//System.out.println(d);
        	}
        }
        
	}
}
