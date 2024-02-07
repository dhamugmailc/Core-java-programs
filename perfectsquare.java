package practice;
import java.util.Scanner;
public class perfectsquare {
public static void main(String args []) {
	Scanner s=new Scanner(System.in);
	 System.out.println(" Enter the number to check :");
     int num=s.nextInt();
     int i=(int)Math.sqrt(num);
    // do {
     if (i*i==num) {
    	 System.out.println(num+"  is a perfect square.");
     
    }
     else {
    	 System.out.println("It is not perfect square.");
     
     }
     System.out.println("check another number:");
    
}
}
  //while(i*i!=num); {
  //Scanner c=new Scanner(System.in);
  //System.out.println("check another number:");
  // int num2=s.nextInt();
  //}


